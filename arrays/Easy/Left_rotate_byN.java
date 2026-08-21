import java.util.*;

class Left_rotate_byN {
    public void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public int[] rotateArray(int[] nums, int k, String direction) {
        int n = nums.length;
        if (k == 0 || n == 0) return nums;
        k = k % n;
        if (direction.equals("right")) {
            reverseArray(nums, 0, n - 1);
            reverseArray(nums, 0, k - 1);
            reverseArray(nums, k, n - 1);
        } else if (direction.equals("left")) {
            reverseArray(nums, 0, k - 1);
            reverseArray(nums, k, n - 1);
            reverseArray(nums, 0, n - 1);
        }
        return nums;
    }
}

class Main {
    public static void main(String[] args) {
        Left_rotate_byN lef = new Left_rotate_byN();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        System.out.print("Enter direction (left/right): ");
        String direction = sc.next();

        int[] result = lef.rotateArray(nums, k, direction);

        System.out.print("Rotated array: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();

        sc.close();
    }
}
import java.util.ArrayList;

class ArrayDuplicates {
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int rightIndex = arr[i] - 1;
            if (arr[i] == i + 1 || arr[rightIndex] == arr[i]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[rightIndex];
                arr[rightIndex] = temp;
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1 && !ans.contains(arr[j])) {
                ans.add(arr[j]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 8, 4, 1, 8, 3, 7};
        System.out.println(findDuplicates(arr));   
    }
}
import java.util.*;

class PrintElementsArray {
    public static void recPrint(int[] arr, int idx) {
        if (idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        recPrint(arr, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();     
        }

        recPrint(arr, 0);              
    }
}
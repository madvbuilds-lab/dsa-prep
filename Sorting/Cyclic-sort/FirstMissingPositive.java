class FirstMissingPositive {
    public static int fmp(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] <= 0 || arr[i] > n || arr[i] == i + 1 || arr[i] == arr[arr[i] - 1]) {
                i++;
            } else {
                int idx = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) return j + 1;
        }
        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = {9, -1, 0, 1, 7, 3, 3};
        System.out.println(fmp(arr));   
    }
}
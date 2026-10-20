class MissingNumInArray {
    public static int missing(int[] arr) {
        int n = arr.length + 1;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == i + 1 || arr[i] == n) {
                i++;
            } else {
                int idx = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) return j + 1;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 6};
        System.out.println(missing(arr));   
    }
}
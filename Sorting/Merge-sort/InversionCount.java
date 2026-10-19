class InversionCount {
    static long mergeCount(int[] arr, int l, int r) {
        if (l >= r) return 0;
        int mid = l + (r - l) / 2;
        long count = mergeCount(arr, l, mid) + mergeCount(arr, mid + 1, r);

        int[] temp = new int[r - l + 1];
        int i = l, j = mid + 1, k = 0;

        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += mid - i + 1;  
            }
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= r)   temp[k++] = arr[j++];

        for (k = 0; k < temp.length; k++) arr[l + k] = temp[k];
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(mergeCount(arr, 0, arr.length - 1));  // 3
    }
}
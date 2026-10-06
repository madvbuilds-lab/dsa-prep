class SearchRowColumnSorted {
    public boolean search(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        int i = 0;
        int j = n - 1;

        while (j >= 0 && i < m) {
            if (arr[i][j] < target) {
                i++;
            } else if (arr[i][j] > target) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int target = 23;

        SearchRowColumnSorted obj = new SearchRowColumnSorted();
        boolean found = obj.search(arr, target);

        System.out.println("Target " + target + " found: " + found);
    }
}
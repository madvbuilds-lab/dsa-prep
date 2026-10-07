import java.util.*;

class MultiplyMatrix {

    public ArrayList<ArrayList<Integer>> multiply(int[][] a, int[][] b) {
        int n = a.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += a[i][k] * b[k][j];
                }
                ans.get(i).add(sum);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] b = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        MultiplyMatrix mm = new MultiplyMatrix();
        ArrayList<ArrayList<Integer>> result = mm.multiply(a, b);

        for (ArrayList<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
import java.util.*;

class PascalTriangle {
    public List<List<Integer>> pascal(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<Integer>());
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    ans.get(i).add(1);
                } else {
                    int val = ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j);
                    ans.get(i).add(val);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PascalTriangle obj = new PascalTriangle();       
        List<List<Integer>> result = obj.pascal(n);

        for (List<Integer> row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();   
    }
}
import java.util.*;

public class SubsetSums {

    ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        solve(0, 0, arr, res);
        return res;
    }

    void solve(int idx, int sum, int[] arr, ArrayList<Integer> res) {
        if (idx == arr.length) {
            res.add(sum);
            return;
        }
        solve(idx + 1, sum + arr[idx], arr, res);
        solve(idx + 1, sum, arr, res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        SubsetSums obj = new SubsetSums();                       
        ArrayList<Integer> res = obj.subsetSums(arr); 

        Collections.sort(res);
        System.out.println(res);

        sc.close();
    }
}
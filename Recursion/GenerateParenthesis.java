import java.util.*;

class GenerateParenthesis {

    public List<String> generateParen(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, 0, 0, "", ans);
        return ans;
    }

    public void generate(int n, int r, int l, String s, List<String> ans) {
        if (r == n) {
            ans.add(s);
            return;
        }
        if (l < n) generate(n, r, l + 1, s + "(", ans);
        if (r < l) generate(n, r + 1, l, s + ")", ans);
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        GenerateParenthesis obj = new GenerateParenthesis();
        List<String> result = obj.generateParen(n);

        System.out.println(result);

        sc.close();
    }
}
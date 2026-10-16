import java.util.*;
class ReverseNum{
    public static int reverse(int n , int r){
        if(n==0) return r;
        return reverse(n/10 , r*10+n%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = reverse(n,0);
        System.out.println(ans);
    }
}
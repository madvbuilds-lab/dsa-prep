import java.util.*;
class UniquePaths {
    public static int uni(int r , int c){
        if(r==1 || c==1) return 1;
        return uni(r-1,c) + uni(r,c-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int res = uni(r,c);
        System.out.println(res);
    }
}
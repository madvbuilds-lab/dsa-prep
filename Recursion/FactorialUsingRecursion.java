class FactorialUsingRecursion{
    public int fact(int n){
        if(n == 0) return 1;
        int ans = n * fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        int n = 8;
        FactorialUsingRecursion fur = new FactorialUsingRecursion();
        int res = fur.fact(n);
        System.out.print(res + " ");
    }
}
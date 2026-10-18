class TowerOfHanoi {
    private static void hanoi(int n , char source , char helper , char dest){
        if(n==0) return;
        hanoi(n-1,source,dest,helper);
        System.out.println(source + "->"+ dest);
        hanoi(n-1,helper,source,dest);
    }
    public static void main(String[] args) {
        hanoi(5,'A','B','C');
    }
}
class Check_sorted{
    static boolean  checkSorted(int[] arr, int n){
        for(int i = 1 ; i<= n ; i++){
            if(arr[i-1] >= arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {489,25,276,28,27,26};
        int n = arr.length;
        boolean result = checkSorted(arr,n);
        System.out.println(result);   
    }
}
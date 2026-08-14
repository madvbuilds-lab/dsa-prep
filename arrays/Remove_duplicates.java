class Remove_duplicates{
    static int removeDuplicates(int[] arr , int n){
        int i = 0 ;
        for(int j = 0 ; j < n ; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3,3,3,4,4,4,4,4};
        int n = arr.length;
        int result = removeDuplicates(arr,n);
        System.out.println(result);
    }
}
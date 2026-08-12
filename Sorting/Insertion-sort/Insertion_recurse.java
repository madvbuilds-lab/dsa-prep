class Insertion_recurse{
    static void insertionSort(int[] arr , int i , int n){
        if(i==n)return;
        int j = i ;
        while(j>0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertionSort(arr , i+1 , n);
    }
    public static void main(String[] args){
        int[] arr = {48,4198,185,15,7810,52,4585,48,7};
        int n =arr.length;
        insertionSort(arr , 0 , n);
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}
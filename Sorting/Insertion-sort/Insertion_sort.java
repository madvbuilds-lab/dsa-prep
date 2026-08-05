class Insertion_sort{
    public static void main(String[] args) {
        int[] arr = {45,7,9812,56,7,2,4,89,75};
        insertionSort(arr);
        for(int i : arr){
            System.out.print( i + " ");
        }   
        System.out.println();
    }
    static void insertionSort(int[] arr){
        int n =arr.length;
        for(int i =0 ; i<=n-1 ; i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
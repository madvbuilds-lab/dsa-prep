class Bubble_sort{
    public static void main(String[] args) {
        int[] arr ={48,56,95,264,941,4,7,2};
        bubbleSort(arr);
        for(int i : arr){
            System.out.print( i + " ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = n-1 ; i>=1 ; i--){
            for(int j = 0 ; j <= i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
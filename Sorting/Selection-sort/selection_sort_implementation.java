class selection_sort_implementation {
    public static void main(String[] args){
        int[] arr = {13,56,48,99,48,56,418};
        selectionSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i =1 ; i < n - 2 ; i++){
            int minIdx = i;
            for(int j = i+1 ; j<=i ; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
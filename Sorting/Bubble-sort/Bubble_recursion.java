class Bubble_recursion{
    static void bubbleSort(int[] arr , int n){
        if(n==1)return;
        boolean didSwap = false;
        for(int j = 0; j <= n-2 ; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                didSwap = true;
            }
        }
        if(!didSwap)return;
        bubbleSort(arr , n-1);
    }
    public static void main(String[] args){
        int[] arr = {45,49,35,76,48,23,48};
        int n = arr.length;
        bubbleSort(arr , n);
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
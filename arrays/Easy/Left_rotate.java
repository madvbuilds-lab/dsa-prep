class Left_rotate{
    static int[] leftRotate(int[] arr , int n){
        int temp = arr[0];
        for(int i =1 ; i<n ; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr ={74,87,121,57,15,45};
        int n = arr.length;
        leftRotate(arr,n);
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    
}
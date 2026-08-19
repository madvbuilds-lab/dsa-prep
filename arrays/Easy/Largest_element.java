class Largest_element{
    static int Largestelement(int[] arr, int n){
        int largest = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args){
        int[] arr = {78,48,48,18,47,22,77};
        int n = arr.length;
        int result = Largestelement(arr,n);
        System.out.println("Largest element: " + result);
    }
}

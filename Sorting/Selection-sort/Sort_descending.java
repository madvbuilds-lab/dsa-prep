/*
Problem: Sorting in Descending order 
Approach: sorting same as basic implementation just find the max and swap
Time: O(n^2)   Space: O(1)
*/
class Sort_descending{
    public static void main(String[] args) {
        int[] arr = {48,18,35,418,26,46};
        selectionSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            int maxIdx = i ;
            for(int j = i+1 ; j < n ; j++){
                if(arr[maxIdx] < arr[j]){
                    maxIdx = j ;
                }
            }
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
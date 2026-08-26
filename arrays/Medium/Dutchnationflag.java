import java.util.*;
class Dutchnationflag{
    public static int[] sortOneTwoThree(int n , int[] arr){
        int low = 0 ; int mid = 0 ;
        int high = n-1;
        while(mid<=high){                 
            if(arr[mid] == 2){
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp ;
                high--;
            }else if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;mid++;
            }else if(arr[mid] == 1){
                mid++;
            }
        }
        return arr; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Values in the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        sortOneTwoThree(n,arr);
        for(int val : arr){
            System.out.print(val + " ");   
        }
        System.out.println();
    }
}

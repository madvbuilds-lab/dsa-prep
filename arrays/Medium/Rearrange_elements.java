import java.util.*;
class Rearrange_elements{
    public static int[] rearrange(int[] arr , int n ){
        int[] arr1 = new int[n];
        int posIdx = 0 ;
        int negIdx = 1 ;
        for(int i=0 ; i < n ; i++){
            if(arr[i] > 0){
                arr1[posIdx] = arr[i];
                posIdx += 2; 
            }else{
                arr1[negIdx] = arr[i];
                negIdx += 2;
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        Scanner sc  =  new  Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int[] res = rearrange(arr,n);
        for(int val : res){
            System.out.print(val+" ");
        }
    }
}
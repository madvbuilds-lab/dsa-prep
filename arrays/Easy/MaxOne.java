import java.util.*;
class MaxOne{
    public static int countOne(int[] arr , int n){
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 1){
                count++;
            }else if ( arr[i] == 0){
                count = 0;
            }
        }
        return count ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int res = countOne(arr , n);
        System.out.println(res);
    }
}
import java.util.*;
class maxSubarraySum{
    public static int maxSum(int[] arr , int n ){
        int sum = 0 ;
        int max = Integer.MIN_VALUE;
        for( int i = 0 ; i < n ; i++){
            sum += arr[i];
            if(sum < 0){
                sum = 0 ;
            }
            max = Math.max(max , sum);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the Values in the array : ");
        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }
        int res = maxSum(arr,N);
        System.out.println(res);
    }
}
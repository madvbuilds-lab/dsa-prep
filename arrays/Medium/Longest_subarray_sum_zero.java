import java.util.*;
class Longest_subarray_sum_zero{
    public static int maxLength(int[] arr , int N){
        Map <Integer,Integer> mp = new HashMap<>();
        int maxi =0; int sum =0;
        for(int i = 0 ; i < N ; i++){
            sum += arr[i];
            if(sum == 0){
                maxi = i+1 ;
            }else{
                if(mp.containsKey(sum)){
                    maxi = Math.max(maxi , i - mp.get(sum));
                }else{
                    mp.put(sum,i);
                }
            }
        }
        return maxi;
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
        int res = maxLength(arr,N);
        System.out.println(res);
    }
}
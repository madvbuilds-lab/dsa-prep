import java.util.*;
public class StockBuysell{
    public static int maximum(int[] arr , int n ){
        int left = 0;
        int right = n-1;
        int maxProfit = 0;
        while(left<right){
            if(arr[left] > arr[right]){
                left++;
            }else if(arr[left] < arr[right]){
                maxProfit = Math.max(maxProfit, arr[right] - arr[left]);
                right--;
            }else{
                right --;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values in the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int res = maximum(arr,n);
        System.out.println(res);
    }
}
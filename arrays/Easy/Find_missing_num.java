import java.util.*;
public class Find_missing_num{
    public static int missNum(int[] arr){
        long n = arr.length;
        long sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
        }
        long exactSum = n * (n+1) / 2 ;
        return (int)(exactSum - sum);
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt(); 
        }
        int res = missNum(arr);
        System.out.print(res); 
        sc.close();       
    }
}
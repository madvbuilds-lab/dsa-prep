import java.util.*;
class FindAppearOnce {
    public static int getSingleElement(int[] arr, int n){
        int maxi = arr[0];
        for(int i = maxi ; i < n ; i++){
            maxi = Math.max(arr[i], maxi);
        }
        int[] hash = new int[maxi + 1];
        for(int i = 0 ; i < n ; i++){
            hash[arr[i]]++;
        }
        for(int i = 0 ; i < n ; i++){
            if(hash[arr[i]]== 1)
            return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the Values inside the array: ");
        int[] arr = new int[n];
        for(int i =0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int res = getSingleElement(arr,n);
        System.out.println(res);
    }
}
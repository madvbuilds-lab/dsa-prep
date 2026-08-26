import java.util.*;
class Twosum{
    public static String findTwoSum(int n , int[] arr , int target){
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int rest = target - arr[i];
            if(mp.containsKey(rest)){
                return "YES";
            }
            mp.put(arr[i] , i);
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values inside the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value : ");
        int target = sc.nextInt();
        String res = findTwoSum(n,arr,target);
        System.out.println(res);
    }
}
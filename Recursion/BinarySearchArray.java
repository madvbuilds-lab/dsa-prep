import java.util.*;
class BinarySearchArray{
    public static int exists(int[] arr, int target , int lo , int hi){
        if(lo > hi) return -1;
        int mid = lo +(hi-lo)/2;
        if(arr[mid] == target) return mid ;
        else if(arr[mid] > target) return exists(arr,target,lo,mid-1);
        else return exists(arr,target,mid+1,hi);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = exists(arr,target,0,n-1);
        System.out.print(res);
    }
}
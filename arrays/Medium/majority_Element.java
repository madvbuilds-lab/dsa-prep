import java.util.*;
class majority_Element{
    public static int majority(int[] arr , int n){
        int cnt =0; int ele = 0;
        for(int i = 0 ; i < n ; i++){
            if(cnt == 0){
                cnt = 1 ;
                ele = arr[i];
            } else if(ele == arr[i]){
                cnt++;
            } else {
                cnt--;
            }
        }
        int cnt1 = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == ele){
                cnt1++;
            }
        }
        if(cnt1 > (n/2)){
            return ele;
        }
        return -1;
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
        int res = majority(arr,N);
        System.out.println(res);
    }
}
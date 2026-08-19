/*
Problem: Second largest Element 
Approach: create 2 variables largest and second largest and then use if else statements to find and then swap.
Time: O(n)   Space: O(n)
*/
import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements: ");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int result = findSecondLargest(arr);
        if(result == Integer.MIN_VALUE){
            System.out.println("No Second Largest Elements");
        }else{
            System.out.println("Second Largest Element: " + result);
        }
        sc.close();
    }
    public static int findSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num: arr){
            if(num>largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest && num < largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
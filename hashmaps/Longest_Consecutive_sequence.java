import java.util.*;
class Longest_Consecutive_sequence {
    public static int longestConsecutive(int[] nums){
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longestStreak = 0 ;
        for(int num : set){
            if(!set.contains(num - 1)){
                int currentNum = num ;
                int currentStreak = 1;
            while(set.contains(currentNum + 1)){
                currentNum++;
                currentStreak++;
            }
            longestStreak = Math.max(longestStreak , currentStreak);
        }
        }
        return longestStreak;
    }
    public static void main(String[] args) {
        int[] arr = {1,9,3,10,4,20,2};
        int res = longestConsecutive(arr);
        System.out.println(res);
    }
}
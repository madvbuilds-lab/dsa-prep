/*
Problem: Two Sum
Link: https://leetcode.com/problems/two-sum/
Approach: Single-pass hashmap storing complements seen so far.
Time: O(n)   Space: O(n)
*/
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }
        return new int[] {};
    }
}

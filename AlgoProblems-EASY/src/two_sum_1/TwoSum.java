package two_sum_1;
//https://leetcode.com/problems/two-sum/

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int nums[] = new int[]{3,2,4};
        int target = 6;
        //Expected Output: [0,1]
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        outer:
        for (int i = 0; i < length-1; i++) {
            int j = i+1;
            while(j < length) {
                if(nums[i] + nums[j] == target) {
                    nums = new int[]{i, j};
                    break outer;
                }
                j++;
            }
        }
        return nums;
    }
}
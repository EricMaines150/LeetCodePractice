/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int solution = 0;
        for(int num:nums){
            solution ^= num;
        }
        return solution;
    }
}
// @lc code=end


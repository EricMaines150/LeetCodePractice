/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start

import java.util.List;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // Place the current element at the k-th position
                nums[k] = nums[i];
                k++; // Move the k pointer forward
            }
        }
        return k;
    }
}
// @lc code=end


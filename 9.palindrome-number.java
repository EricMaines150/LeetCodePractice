/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        long reversed = 0;
        long temp = x;

        while(temp != 0){
            long digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return (reversed == x);
    }
}
// @lc code=end


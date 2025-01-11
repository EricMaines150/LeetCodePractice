/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        //Create two for loops to compare needle to haystack, return 0 if needle is in haystack, return -1 if not
        //Create nested loops to compare characters one at a time vs counting number of indices in needle and comparing chuncks of needle sized haystacks
       if (haystack.contains((needle))){
        return haystack.indexOf(needle);
       }
       return -1;
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        
        //initialize prefix with the first string
        String prefix = strs[0]; 
        

        //iterate over the remaining strings
        for (int i =1; i < strs.length; i++){
            String current = strs[i];
            int j = 0;
            while (j < prefix.length() && j < current.length() && prefix.charAt(j) == current.charAt(j)){
                j++;
            }
            //Update prefix to the common prefix
            prefix = prefix.substring(0, j); 
            if(prefix.isEmpty()){
                break;
            }
        }

        return prefix;
    }
}
// @lc code=end


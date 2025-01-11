/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;
        int prevValue = 0;

        for(int i=s.length()-1; i>=0; i--){
            int value = map.get(s.charAt(i));
                if(value<prevValue){
                    result-=value;
                }else{
                    result+=value;
                }
                prevValue=value;
        }
        return result;
    }
}
// @lc code=end


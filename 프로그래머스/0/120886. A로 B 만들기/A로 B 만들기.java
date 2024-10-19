import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] str1 = before.toCharArray();
        char[] str2 = after.toCharArray();
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        return new String(str1).contains(new String(str2)) ? 1 : 0;
    }
}
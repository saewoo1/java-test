import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        if (length != 4 && length != 6) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return answer;
    }
}
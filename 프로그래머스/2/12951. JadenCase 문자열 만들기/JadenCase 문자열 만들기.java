import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ");
        boolean isSpace = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                answer.append(" ");
                isSpace = true;
            }
            else {
                if (isSpace) {
                    answer.append(Character.toUpperCase(c));
                    isSpace = false;
                }
                else {
                    answer.append(Character.toLowerCase(c));
                }
            }
        }
        return answer.toString();
    }
}
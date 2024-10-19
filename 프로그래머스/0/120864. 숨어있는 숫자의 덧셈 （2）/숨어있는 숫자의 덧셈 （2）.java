import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] myStringChar = my_string.toCharArray();
        for (int i = 0; i < my_string.length(); i++) {
            String tmp = "0";
            while(i < my_string.length() && Character.isDigit(myStringChar[i])) {
                tmp += myStringChar[i];
                i++;
            }
            answer += Integer.parseInt(tmp);
        }
        return answer;
    }
}
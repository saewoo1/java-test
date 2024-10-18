import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder(my_string);
        char tmp = answer.charAt(num1);
        answer.setCharAt(num1, answer.charAt(num2));
        answer.setCharAt(num2, tmp);
        return answer.toString();
    }
}
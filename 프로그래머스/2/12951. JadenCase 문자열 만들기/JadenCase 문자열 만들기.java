import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        boolean isFirst = true;
        for (String word : s.toLowerCase().split("")) {
            answer += isFirst ? word.toUpperCase() : word;
            isFirst = word.equals(" ") ? true : false;
        }
        return answer;
    }
}
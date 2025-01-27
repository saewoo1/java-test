import java.util.*;

class Solution {
    public String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();
        for (String word : arr) {
            answer.append(word);
        }
        return answer.toString();
    }
}
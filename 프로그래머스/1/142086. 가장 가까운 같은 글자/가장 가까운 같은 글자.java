import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (map.containsKey(currentChar)) {
                answer[i] = Math.abs(i - map.get(currentChar));
            }
            else {
                answer[i] = -1;
            }
            map.put(currentChar, i);
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        String str = "";
        
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            char key = entry.getKey();
            int count = entry.getValue();
            
            if (count == 1) {
                str += key;
            }
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
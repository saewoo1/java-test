import java.util.*;

class Solution {
    public int solution(String before, String after) {
        Map<Character, Integer> beforeCounter = getCharCountMap(before);
        Map<Character, Integer> afterCounter = getCharCountMap(after);
        
        for (Map.Entry<Character, Integer> entry : beforeCounter.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            
            if (!afterCounter.containsKey(key) || afterCounter.get(key) < value) {
                return 0;
            }
        }
        return 1;
    }
    private Map<Character, Integer> getCharCountMap(String str) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : str.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        
        return counter;
    }
}
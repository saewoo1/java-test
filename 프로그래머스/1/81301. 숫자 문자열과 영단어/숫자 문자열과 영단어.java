import java.util.*;

class Solution {
    public int solution(String s) {
        if (s.matches("\\d+")) {
            return Integer.parseInt(s);
        }
        Map<String, Integer> changer = new LinkedHashMap<>();
        changer.put("zero", 0);
        changer.put("one", 1);
        changer.put("two", 2);
        changer.put("three", 3);
        changer.put("four", 4);
        changer.put("five", 5);
        changer.put("six", 6);
        changer.put("seven", 7);
        changer.put("eight", 8);
        changer.put("nine", 9);
        
        for (Map.Entry<String, Integer> entry : changer.entrySet()) {
            String word = entry.getKey();
            int number = entry.getValue();
            if (s.contains(word)) {
                s = s.replaceAll(word, number + "");
            }
        }
        return Integer.parseInt(s);
    }
}
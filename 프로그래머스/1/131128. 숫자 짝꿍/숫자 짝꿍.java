import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> xMap = new HashMap<>();
        Map<Character, Integer> yMap = new HashMap<>();
        
        for (char c : X.toCharArray()) {
            xMap.put(c, xMap.getOrDefault(c, 0) + 1);
        }
        for (char c : Y.toCharArray()) {
            yMap.put(c, yMap.getOrDefault(c, 0) + 1);
        }
        List<Character> xKeys = new ArrayList<>(xMap.keySet());
        xKeys.sort(Comparator.reverseOrder());
        //xKeys.sort((a, b) -> b - a);
        for (char key : xKeys) {
            int count = Math.min(xMap.get(key), yMap.getOrDefault(key, 0));
            for (int i = 0; i < count; i++) {
                sb.append(key);
            }
        }
        if (sb.length() == 0) {
            return "-1";
        }
        if (sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }
}
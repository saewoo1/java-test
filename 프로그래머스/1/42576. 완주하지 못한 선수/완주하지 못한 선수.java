import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> clears = new HashMap<>();
        
        // 완주자가 1명 더 적음
        for (int i = 0; i < completion.length; i++) {
            String part = participant[i];
            String comple = completion[i];
            
            clears.put(part, clears.getOrDefault(part, 0) + 1);
            clears.put(comple, clears.getOrDefault(comple, 0) - 1);
        }
        String last = participant[participant.length - 1];
        clears.put(last, clears.getOrDefault(last, 0) + 1);
        for (String key : clears.keySet()) {
            if (clears.get(key) > 0) {
                return key;
            }
        }
        return null;
    }
}
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < completion.length; i++) {
            String part = participant[i];
            String comple = completion[i];
            
            counter.put(part, counter.getOrDefault(part, 0) + 1);
            counter.put(comple, counter.getOrDefault(comple, 0) - 1);
        }
        String lastParticipant = participant[participant.length - 1];
        counter.put(lastParticipant, counter.getOrDefault(lastParticipant, 0) + 1);
        for (String key : counter.keySet()) {
            if (counter.get(key) == 1) {
                return key;
            }
        }
        return null;
    }
}
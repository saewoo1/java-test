import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String runner : participant) {
            map.put(runner, map.getOrDefault(runner, 0) + 1);
        }
        for (String complete : completion) {
            map.put(complete, map.getOrDefault(complete, 0) - 1);
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() != 0) {
                answer = pair.getKey();
            }
        }
        return answer;
    }
}
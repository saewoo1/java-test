import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
       
        Map<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {
            String key = keymap[i];
            for (int j = 0; j < key.length(); j++) {
                char alphabet = key.charAt(j);
                int idx = j + 1;
                if (counter.containsKey(alphabet)) {
                    idx = Math.min(j + 1, counter.get(alphabet));
                }
                counter.put(alphabet, idx);
            }
        }
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int count = 0;
            for (int j = 0; j < target.length(); j++) {
                char key = target.charAt(j);
                if (counter.containsKey(key)) {
                    count += counter.get(key);
                }
                else {
                    count = -1;
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
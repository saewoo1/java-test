import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> counter = new HashMap<>();
        int maxCount = 0;
        // 카운터 생성
        for (int i = 0; i < array.length; i++) {
            counter.put(array[i], counter.getOrDefault(array[i], 0) + 1);
        }
        List<Integer> keys = new ArrayList<>();
        // maxCount 값 찾기
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            
            if (value > maxCount) {
                keys.clear();
                maxCount = value;
                keys.add(key);
            }
            else if (value == maxCount) {
                keys.add(key);
            }
        }
        return keys.size() > 1 ? -1 : keys.get(0);
    }
}
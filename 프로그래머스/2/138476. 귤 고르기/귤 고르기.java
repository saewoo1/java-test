import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        List<Integer> count = new ArrayList<>();
        Map<Integer, Integer> tangerineMap = new HashMap<>();
        for (int tan : tangerine) {
            tangerineMap.put(tan, tangerineMap.getOrDefault(tan, 0) + 1);
        }
        
        for (int tan : tangerineMap.values()) {
            count.add(tan);
        }
        // 개수 많은거 먼저
        Collections.sort(count, Collections.reverseOrder());
        int totalCount = 0;
        int totalSort = 0;
        for (int value : count) {
            totalSort++;
            k -= value;
            if (k <= 0) {
                return totalSort;
            }
        }
        return answer;
    }
}
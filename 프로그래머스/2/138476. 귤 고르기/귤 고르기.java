import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (Integer gyul : tangerine) {
            counter.put(gyul, counter.getOrDefault(gyul, 0) + 1);
        }
        // counter 에서 value가 최소인 애들 먼저 빼고, k랑 같아진 시점에서 key의 개수?
        List<Integer> sortedValues = new ArrayList<>(counter.values());
        // 오름차순 정렬
        Collections.sort(sortedValues, Collections.reverseOrder());
        
        int total = 0; // 고른거 총 개수
        int count = 0; // 고른 귤 종류 수
        for (int value : sortedValues) {
            count++;
            k -= value;
            
            if (k <= 0) {
                return count;
            }
           
        }
        return count;
    }
}
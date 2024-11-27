import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int n = scoville.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.offer(scoville[i]);
        }
        while (pq.size() >= 2) {
            int first = pq.poll();
            int second = pq.poll();
            if (first >= K) {
                return answer;
            }
            
            int mixed = first + second * 2;
            pq.offer(mixed);
            answer++;
            
        }
        return pq.peek() < K ? -1 : answer;
    }
}
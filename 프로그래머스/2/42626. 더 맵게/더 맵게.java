import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int sco : scoville) {
            pq.offer(sco);
        }
        while (pq.size() > 1) {
            if (pq.peek() >= K) {
                return answer;
            }
            int first = pq.poll();
            int second = pq.poll();
            
            pq.offer(first + second * 2);
            answer++;
        }
        if (pq.size() == 1 && pq.peek() >= K) {
            return answer;
        }
        return -1;
    }
}
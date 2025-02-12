import java.util.*;

/*
야근 피로도 : 야근 시작 시점 + 남은 일일 작업양^2
N시간 동안 야근 피로도 최소화하기
야근 피로도 최소화한 값을 리턴하라
*/
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        // 잔업이 없다면 야근지수 0
        long remains = sum(works);
        if (n >= remains) {
            return 0;
        }
        
        // 내림차순으로 넣기
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        for (int work : works) {
            pq.offer(work);
        }
        while (n != 0) {
            int maxTime = pq.poll();
            pq.offer(maxTime - 1);
            n--;
        }
        while (!pq.isEmpty()) {
            int elem = pq.poll();
            answer += elem * elem;
        }
        return answer;
    }
    
    public long sum(int[] works) {
        long result = 0;
        for (int i : works) {
            result += i;
        }
        return result;
    }
}
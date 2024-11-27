import java.util.*;

class Solution {
    
    class Process {
        int start;
        int speed;
        
        public Process(int start, int speed) {
            this.start = start;
            this.speed = speed;
        }
    }
    
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Process> queue = new LinkedList<>();
        
        // 큐에 각 정보를 담는다
        for (int i = 0; i < speeds.length; i++) {
            queue.offer(new Process(progresses[i], speeds[i]));
        }
        
        int day = 0;
        while (!queue.isEmpty()) {
            int count = 0;
            
            // 완료 가능한 작업이 있음
            while (!queue.isEmpty() && queue.peek().start + queue.peek().speed * day >= 100) {
                queue.poll();
                count++;
            }
            if (count > 0) {
                answer.add(count);
            }
            day++;
        }
        
        return answer.stream().mapToInt(e -> e).toArray();
    }
}
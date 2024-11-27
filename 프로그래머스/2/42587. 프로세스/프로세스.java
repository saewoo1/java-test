import java.util.*;

class Solution {
    class Process {
        int priority;
        int location;
        
        public Process(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }
    
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Process> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Process(priorities[i], i));
        }
        
        while(!queue.isEmpty()) {
            Process job = queue.poll();
            if (queue.stream().
                anyMatch(otherJob -> otherJob.priority > job.priority)) {
                // 나머지 중 우선 순위가 더 높은 애가 있음
                queue.offer(job);
            }
            else {
                answer++;
                if (job.location == location) {
                    break;
                }
            }
            
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Queue<Integer> belt = new LinkedList<>();
        Stack<Integer> sub = new Stack<>();
        
        // 오름차순으로 큐에 넣음
        for (int i = 1; i <= order.length; i++) {
            belt.offer(i);
        }
        for (int boxOrder : order) {
            // 보조 밸트 뒤적
            if (!sub.isEmpty() && sub.peek() == boxOrder) {
                answer++;
                sub.pop();
                continue;
            }
            
            // 밸트 값이 일치하지 않으면, 보조밸트에 계속 쌓는다
            while (!belt.isEmpty() && belt.peek() != boxOrder) {
                sub.push(belt.poll());
            }
            
            // 벨트에서 일치하는거 찾았음
            if (!belt.isEmpty() && belt.peek() == boxOrder) {
                belt.poll();
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}
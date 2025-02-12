import java.util.*;
// queue를 2개 두고?
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Queue<Integer> belt = new LinkedList<>();
        Stack<Integer> sub = new Stack<>();
        // 벨트에 순차적으로 담긴 상자들
        for (int i = 1; i <= order.length; i++) {
            belt.offer(i);
        }
        
        for (int boxOrder : order) {
            // 보조벨트에서 찾음 -> answer 늘리고, 다음 박스 ㄱㄱ
            if (!sub.isEmpty() && sub.peek() == boxOrder) {
                sub.pop();
                answer++;
                continue;
            }
            
            // 벨트에 맞는게 없으면 보조벨트로 옮긴다
            while (!belt.isEmpty() && belt.peek() != boxOrder) {
                sub.push(belt.poll());
            }
            
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
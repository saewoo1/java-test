import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        int[] copy = priorities.clone();
        Arrays.sort(copy);
        int maxIdx = priorities.length - 1;
        int targetIdx = location;
        int count = 0;
        
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(priorities[i]);
        }
        while (true) {
            // 큐의 첫번 째 값이 실행 할 순서가 맞다면
            if (queue.peek() == copy[maxIdx]) {
                queue.poll();
                maxIdx--;
                count++;
                
                if (targetIdx == 0) {
                    return count;
                }
            } else {
                queue.offer(queue.poll());
            }
            targetIdx = targetIdx - 1 < 0 ? queue.size() - 1 : targetIdx - 1;
        }
    }
}
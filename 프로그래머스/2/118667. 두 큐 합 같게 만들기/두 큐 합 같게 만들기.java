import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int size = queue1.length + queue2.length;
        long sum1 = 0;
        long sum2 = 0;
        int count = 0;
        
        // 각각 큐에 숫자들을 담고, sum에 요소들을 더합니다.
        Queue<Integer> first = new LinkedList<>();
        Queue<Integer> second = new LinkedList<>();
        for (Integer number : queue1) {
            first.offer(number);
            sum1 += number;
        }
        for (Integer number : queue2) {
            second.offer(number);
            sum2 += number;
        }
        if (sum1 == sum2) {
            return 0;
        }
        // 반복 횟수가 길이를 넘지 않고, 각 큐가 비어있지 않을 동안 반복한다
        while (count < size * 2) {
            if (sum1 < sum2) {
                int num = second.poll();
                first.offer(num);
                sum1 += num;
                sum2 -= num;
            } else {
                int num = first.poll();
                second.offer(num);
                sum1 -= num;
                sum2 += num;
            }
            count++;
            
            // 합이 같아지면 count 리턴
            if (sum1 == sum2) {
                return count;
            }
        }
        return -1;
    }
}
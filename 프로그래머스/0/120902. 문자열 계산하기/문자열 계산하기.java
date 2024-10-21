import java.util.*;

class Solution {
    public int solution(String my_string) {
        Queue<String> queue = new LinkedList<>();
        String[] str = my_string.split(" ");
        for (String s : str) {
            queue.add(s);
        }
        // 첫 번째 피연산자 추출
        int answer = Integer.parseInt(queue.poll());
        while (!queue.isEmpty()) {
            String elem = queue.poll();
            int number = Integer.parseInt(queue.poll());
            if (elem.equals("+")) {
                answer += number;
            }
            if (elem.equals("-")) {
                answer -= number;
            }
        }

        return answer;
    }
}
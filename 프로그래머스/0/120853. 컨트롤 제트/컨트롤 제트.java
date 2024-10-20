import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (String elem : s.split(" ")) {
            if (elem.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(elem));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
}
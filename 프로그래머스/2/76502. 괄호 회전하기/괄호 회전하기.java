import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = s + s;
        for (int i = 0; i < s.length(); i++) {
            String rotated = str.substring(i, i + s.length());
            if(isValid(rotated)) {
                answer++;
            }
        }
        return answer;
    }
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if (c == ')' && stack.peek() == '(') {
                stack.pop();
                continue;
            }
            if (c == '}' && stack.peek() == '{') {
                stack.pop();
                continue;
            }
            if (c == ']' && stack.peek() == '[') {
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        return stack.size() == 0 ? true : false;
    }
}
import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int remove = 0;
        for (char c : number.toCharArray()) {
            while (remove < k && !stack.isEmpty() && c > stack.peek()) {
                stack.pop();
                remove++;
            }
            stack.push(c);
        }
        
        while (remove < k && !stack.isEmpty()) {
            stack.pop();
            remove++;
        }
        char[] result = new char[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return new String(result);
    }
}
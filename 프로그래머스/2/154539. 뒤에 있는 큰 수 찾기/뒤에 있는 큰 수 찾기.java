import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
    int[] answer = new int[numbers.length];
		Stack<Integer> stack = new Stack<>();

		for (int i = numbers.length - 1; i >= 0; i--) {
			while (!stack.isEmpty()) {
				int maxInStack = stack.peek();
				if (maxInStack > numbers[i]) {
					answer[i] = maxInStack;
					break;
				} else {
					stack.pop();
				}
			}
			if (stack.isEmpty()) {
				answer[i] = -1;
			}
			stack.push(numbers[i]);

		}
		return answer;
    }
}
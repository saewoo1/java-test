import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < count; i++) {
            stack.push(scanner.nextInt());
            if (stack.peek() == 0) {
                stack.pop();
                stack.pop();
            }
        }
        int sum = 0;
        for (Integer number : stack) {
            sum += number;
        }
        System.out.println(sum);
    }
}
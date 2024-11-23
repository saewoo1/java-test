import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());
        
        System.out.println(fibonacci(number));
    }
    
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        if (n == 0) {
            return f0;
        }
        if (n == 1) {
            return f1;
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
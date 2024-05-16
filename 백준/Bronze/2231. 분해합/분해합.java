import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        for (int i = 0; i < number; i++) {
            int sum = 0;
            int idx = i;
            while (idx != 0) {
                sum += idx % 10;
                idx /= 10;
            }
            if (sum + i == number) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
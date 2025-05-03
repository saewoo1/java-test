import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();

        String[] numbers = line.split("-");
        long result = 0L;
        for (int i = 0; i < numbers.length; i++) {
            String part = numbers[i];
            long sum = 0L;
            
            String[] addParts = part.split("\\+");
            for (String num : addParts) {
                sum += Long.parseLong(num);
            }
            if (i == 0) {
                result += sum;
            } else {
                result -= sum;
            }
        }
        System.out.println(result);
    }
}
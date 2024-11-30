import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] numbers = line.toCharArray();
        char[] reverse = new char[numbers.length];
        Arrays.sort(numbers);
        
        for (int i = 0; i < numbers.length; i++) {
            reverse[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println(new String(reverse));
    }
}
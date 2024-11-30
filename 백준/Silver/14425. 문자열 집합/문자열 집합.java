import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int lineCount = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            map.put(scanner.nextLine(), 0);
        }
        
        int answer = 0;
        for (int i = 0; i < lineCount; i++) {
            String line = scanner.nextLine();
            if (map.containsKey(line)) {
                answer++;
            }
        }
        
        System.out.println(answer);
    }
}
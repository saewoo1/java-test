import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String vowels = "aeiou";
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("#")) {
                break;
            }
            
            line = line.toLowerCase();
            int count = 0;
            
            for (int i = 0; i < line.length(); i++) {
                char target = line.charAt(i);
                if (vowels.indexOf(target) != -1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
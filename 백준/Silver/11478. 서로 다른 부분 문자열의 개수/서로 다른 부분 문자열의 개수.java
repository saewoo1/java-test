import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String prev = "";
        
        Set<String> result = new HashSet<>();
        for (int len = 1; len <= s.length(); len++) {
            for (int i = 0; i <= s.length() - len; i++) {
                String subString = s.substring(i, i + len);
                result.add(subString);
            }
        }
        
        System.out.println(result.size());
    }
}
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] lines = new String[N];
        
        for (int i = 0; i < N; i++) {
            lines[i] = scanner.next();
        }
        
        int end = lines[0].length();
        for (int i = 1; i <= end; i++) {
            Set<String> suffix = new HashSet<>();
            boolean isUnique = true;
            for (int j = 0; j < N; j++) {
                String number = lines[j].substring(end - i);
                if (!suffix.add(number)) { // 중복이면 Flase 반환
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(i);
                return;
            }
        }    

    }
}
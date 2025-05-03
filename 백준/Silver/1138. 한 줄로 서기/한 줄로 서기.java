import java.util.*;

public class Main {
    static int n;
    static int[] order;
    static int[] result;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        order = new int[n];
        result = new int[n];
        
        // 순서들을 입력받음
        for (int i = 0; i < n; i++) {
            order[i] = scanner.nextInt();
        }
        
        for (int i = 1; i <= n; i++) {
            // i번째 사람 조건
            int count = order[i - 1];
            for (int j = 0; j < n; j++) {
                // 빈자리라면
                if (result[j] == 0) {
                    if (count == 0) {
                        result[j] = i;
                        break;
                    }
                    count--;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        
    }
}
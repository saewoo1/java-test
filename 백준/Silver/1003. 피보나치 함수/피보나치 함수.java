import java.util.*;
// N은 0 ~ 40, 0과 1은 각각 몇 번씩 호출되었을까?
public class Main {
    static int[] fibo;
    static int N;
    static int T;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        fibo = new int[45];
        fibo[0] = 0;
        fibo[1] = 1;
        
        // dp에 수들을 채워 넣는다
        for (int i = 2; i < 45; i++) {
            fibo[i] = fibo[i - 2] + fibo[i - 1];
        }
        /* 
        fibo[5] = fibo[3] + fibo[4]
                = (fibo[1] + fibo[2]) + (fibo[2] + fibo[3])
                = (fibo[1] + fibo[0] + fibo[1]) + (fibo[0] + fibo[1] + fibo[1] + fibo[2])
                = (1 + 0 + 1) + (0 + 1 + 1 + fibo[0] + fibo[1])
                = (1 = 5회, 0 = 3회)
        
        */
        for (int i = 0; i < T; i++) {
            N = scanner.nextInt();
            if (N == 0) {
                System.out.println("1 0");
                continue;
            }
            System.out.println(fibo[N - 1] + " " + fibo[N]);
        }
    }
}
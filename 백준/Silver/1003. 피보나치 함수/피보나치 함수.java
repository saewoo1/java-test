import java.util.*;
// N은 0 ~ 40, 0과 1은 각각 몇 번씩 호출되었을까?
public class Main {
    static int[] zeroCount;
    static int[] oneCount;
    static int N;
    static int T;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        zeroCount = new int[45];
        zeroCount[0] = 1;
        zeroCount[1] = 0;
        
        oneCount = new int[45];
        oneCount[1] = 1;
        oneCount[0] = 0;
        
        for (int i = 2; i < 45; i++) {
            zeroCount[i] = zeroCount[i - 2] + zeroCount[i - 1];
            oneCount[i] = oneCount[i - 2] + oneCount[i - 1];
        }
        
        for (int i = 0; i < T; i++) {
            N = scanner.nextInt();
            System.out.println(zeroCount[N] + " " + oneCount[N]);
        }
    }
}
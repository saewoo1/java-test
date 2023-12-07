import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(stk.nextToken());
        int target = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        int pairCount = 0;
        int start = 0;
        int end = 0;
        int sum = 0;
        while (true) {
            if (sum >= target) {
                sum -= arr[start++];
            } else if (end == n) {
                break;
            } else {
                sum += arr[end++];
            }
            if (sum == target) {
                pairCount++;
            }
        }
        System.out.println(pairCount);
    }
}

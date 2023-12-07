import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(reader.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        stk = new StringTokenizer(reader.readLine());
        int target = Integer.parseInt(stk.nextToken());

        // 합이 target과 일치하는 수를 구하라.
        int start = 0;
        int end = n - 1;
        int pairCount = 0;
        Arrays.sort(arr);
        while (start < end) {
            if (arr[start] + arr[end] == target) {
                pairCount++;
                start++;
            } else if (arr[start] + arr[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println(pairCount);
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(reader.readLine());
        int m = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(reader.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        int matchCount = 0;
        while (start < end) {
            if (arr[start] + arr[end] == m) {
                matchCount++;
                start++;
                end--;
            } else if (arr[start] + arr[end] < m) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(matchCount);
    }
}

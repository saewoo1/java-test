import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(reader.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        int prefix = 0;
        for (int i = 0; i < k; i++) {
            prefix += arr[i];
        }

        int max = prefix;
        for (int i = k; i < n; i++) {
            prefix = prefix + arr[i] - arr[i - k];
            max = Math.max(max, prefix);
        }

        System.out.println(max);
    }
}

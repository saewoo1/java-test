

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken()); // 재료 개수
        stringTokenizer = new StringTokenizer(reader.readLine());
        int m = Integer.parseInt(stringTokenizer.nextToken()); // 필요한 수 -> target

        stringTokenizer = new StringTokenizer(reader.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        int pairCount = 0;
        while (start < end) {
            if (arr[start] + arr[end] == m) {
                pairCount++;
                start++;
            } else if (arr[start] + arr[end] > m) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println(pairCount);
    }
}

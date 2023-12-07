
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(tokenizer.nextToken()); // 배열 a 크기
        int m = Integer.parseInt(tokenizer.nextToken()); // 배열 b 크기

        tokenizer = new StringTokenizer(reader.readLine(), " ");
        int[] arrA = new int[n];

        for (int i = 0; i < n; i++) {
            arrA[i] = Integer.parseInt(tokenizer.nextToken());
        }

        tokenizer = new StringTokenizer(reader.readLine(), " ");
        int[] arrB = new int[m];
        for (int i = 0; i < m; i++) {
            arrB[i] = Integer.parseInt(tokenizer.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (arrA[i] < arrB[j]) {
                sb.append(arrA[i]).append(" ");
                i++;
            } else if (arrA[i] > arrB[j]) {
                sb.append(arrB[j]).append(" ");
                j++;
            } else {
                sb.append(arrA[i]).append(" ");
                sb.append(arrB[j]).append(" ");
                i++;
                j++;
            }
        }
        if (i == n) {
            for (int k = j; k < m; k++) {
                sb.append(arrB[k]).append(" ");
            }
        }
        if (j == m) {
            for (int k = i; k < n; k++) {
                sb.append(arrA[k]).append(" ");
            }
        }
        System.out.println(sb);
    }
}

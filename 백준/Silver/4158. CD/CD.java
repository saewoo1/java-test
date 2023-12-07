
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());
            if (n == 0 && m == 0) {
                break;
            }
            int[] arrN = new int[n];
            for (int i = 0; i < n; i++) {
                arrN[i] = Integer.parseInt(reader.readLine());
            }

            int[] arrM = new int[m];
            for (int i = 0; i < n; i++) {
                arrM[i] = Integer.parseInt(reader.readLine());
            }

            int pairCount = 0;
            int i = 0, j = 0;
            while (i < n && j < m) {
                if (arrN[i] == arrM[j]) {
                    pairCount++;
                    i++;
                    j++;
                } else if (arrN[i] > arrM[j]) {
                    j++;
                } else {
                    i++;
                }
            }
            System.out.println(pairCount);
        }
    }
}

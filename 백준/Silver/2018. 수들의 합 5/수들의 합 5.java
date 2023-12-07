
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int number = Integer.parseInt(tokenizer.nextToken());

        int start = 1, end = 1;
        int matchCount = 1; // 일단 number 그 자체
        int sum = 1;
        while (end < number) {
            if (sum <= number) {
                sum += ++end;
            } else {
                sum -= start++;
            }
            if (sum == number) {
                matchCount++;
            }
        }
        System.out.println(matchCount);
    }
}


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
        int pairCount = 1;
        int sum = 1;
        while (end != number) {
            if (sum == number) {
                pairCount++;
                end++;
                sum += end;
            }
            if (sum < number) {
                end++;
                sum += end;
            }
            if (sum > number) {
                sum -= start;
                start++;
            }
        }


        System.out.println(pairCount);
    }
}

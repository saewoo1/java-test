import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String numbers = bufferedReader.readLine();
    StringTokenizer stringTokenizer = new StringTokenizer(numbers);
    JudgePrimitive2 judgePrimitive2 = new JudgePrimitive2();

    int M = Integer.parseInt(stringTokenizer.nextToken());
    int N = Integer.parseInt(stringTokenizer.nextToken());

    for (int i = M; i <= N; i++) {
      if (judgePrimitive2.isPrimitive(i) == 1)
        System.out.println(i);
    }
  }
}

class JudgePrimitive2 {
  int isPrimitive(int num) {
    int flag = 1;

    if (num == 1)
        flag = 0;
    for (int i = 2; i <= num / i; i++) {
      if (num % i == 0) {
        flag = 0;
        break;
      }
    }
    return flag;
  }
}

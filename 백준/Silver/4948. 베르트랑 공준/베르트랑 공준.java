import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    JudgePrimitive3 judgePrimitive3 = new JudgePrimitive3();

    /*
    * 1. for문의 끝을 지정해야함.
    * 2. 각각의 케이스에 원본과 *2한 범위를 지정.
    * 3. 소수를 구하는 케이스. 개수만 구하면 된다.
    * 4. 넣어서 출력하거나 바로 for문 돌면서 출력
    */
    int count = 0;
    for (;;) {
      int i = Integer.parseInt(bufferedReader.readLine());
      int double_i = i * 2;
      if (i == 0)
        break;
      for (int j = i + 1; j <= double_i; j++) {
        if (judgePrimitive3.isPrimitive(j) == 1) {
          count++;
        }
      }
      System.out.println(count);
      count = 0;
    }
  }
}
class JudgePrimitive3 {
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
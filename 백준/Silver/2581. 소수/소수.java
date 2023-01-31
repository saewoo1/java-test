import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    JudgePrimitive judgePrimitive = new JudgePrimitive();

    int M = scanner.nextInt();
    int N = scanner.nextInt();
    int res = 0;
    int min = 0;

    for (int i = M; i <= N; i++)
    {
      if (judgePrimitive.isPrimitive(i) == 1) {
        res += i;
      }
    }

    for (int i = M; i <= N; i++) {
      if (judgePrimitive.isPrimitive(i) == 1) {
        min = i;
        break;
      }
    }
    if (res == 0 && min == 0)
      System.out.println(-1);
    else {
      System.out.println(res);
      System.out.println(min);
    }
  }
}

class JudgePrimitive {
  int isPrimitive(int num) {
    int flag = 0;

    if (num == 2)
      flag = 1;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        flag = 0;
        break;
      }
      flag = 1;
    }
    return flag;
  }
}

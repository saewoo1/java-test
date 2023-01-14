import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int count = 0;

    for (;;) {
      if (k % 5 == 0) {
        System.out.println(k / 5 + count);
        break;
      } else {
        k -= 3;
        count++;
      }
      if (k < 0) {
        System.out.println(-1);
        break;
      }
    }
  }
}

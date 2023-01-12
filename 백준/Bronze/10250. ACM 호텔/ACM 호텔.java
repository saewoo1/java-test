import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();

    for (int i = 0 ; i <count; i++) {
      int H = scanner.nextInt();
      int W = scanner.nextInt();
      int N = scanner.nextInt();
      int x = (N / H) + 1;
      int y = N % H;
      if (N % H == 0) {
        x = N / H;
        y = H;
      }
      System.out.println(y * 100 + x);
    }
  }
}

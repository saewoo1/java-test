import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = scanner.nextInt(); // testcase의 개수

    for (int i = 0; i < count; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      System.out.println(a + b);
    }
  }
}
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String numbers = scanner.nextLine();
    StringTokenizer stringTokenizer = new StringTokenizer(numbers);
    long res = 0;
    for (int i = 0; i < 3; i++)
      res += Long.parseLong(stringTokenizer.nextToken());
    System.out.println(res);
  }
}

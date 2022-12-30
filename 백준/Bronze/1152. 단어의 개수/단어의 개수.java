import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String test = scanner.nextLine().trim();
    StringTokenizer stringTokenizer = new StringTokenizer(test, " ");
    System.out.println(stringTokenizer.countTokens());
  }
}

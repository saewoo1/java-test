import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String test = scanner.nextLine();
    StringTokenizer stringTokenizer = new StringTokenizer(test, " ");
    String A = stringTokenizer.nextToken();
    String B = stringTokenizer.nextToken();

    A = new StringBuffer(A).reverse().toString();
    B = new StringBuffer(B).reverse().toString();

    String res = Integer.parseInt(A) > Integer.parseInt(B) ? A : B;
    System.out.println(res);
  }
}

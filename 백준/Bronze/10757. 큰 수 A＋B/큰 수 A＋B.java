import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    BigInteger A = new BigInteger(scanner.next());
    BigInteger B = new BigInteger(scanner.next());

    A = A.add(B);
    System.out.println(A.toString());
  }
}

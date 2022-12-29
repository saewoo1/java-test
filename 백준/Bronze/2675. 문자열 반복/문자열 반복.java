import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();

    for (int i = 0; i < count; i++) {
      int num = scanner.nextInt();
      String test = scanner.next();

      for (int j = 0; j < test.length(); j++) {
        for (int k = 0; k < num; k++) {
          System.out.print(test.charAt(j));
        }
      }
        System.out.println();
    }
  }
}

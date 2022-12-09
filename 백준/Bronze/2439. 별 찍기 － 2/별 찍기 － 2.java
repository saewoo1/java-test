import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int lineCount = scanner.nextInt();

    for (int i = 0; i < lineCount; i++) {
      for (int j = 1; j < lineCount - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
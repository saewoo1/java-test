import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    for (int i = num / 4; i > 0; i--)
    {
      System.out.printf("long ");
    }
    System.out.printf("int");
  }
}

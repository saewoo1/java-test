import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int cost = scanner.nextInt();
    int count = scanner.nextInt();
    int compare = 0;

    for (int i = 0; i < count; i++) {
      int price = scanner.nextInt();
      int gae = scanner.nextInt();
      compare += price * gae;
    }

    if (cost == compare)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
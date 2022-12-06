import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();

    while (true) {
      String line = scanner.nextLine();
      int divider = line.indexOf(" ");
      int left = Integer.parseInt(line.substring(0, divider));
      int right = Integer.parseInt(line.substring(divider + 1));
      if (left != 0 && right != 0) {
        System.out.println(left + right);
      } else
        break ;
    }
  }
}
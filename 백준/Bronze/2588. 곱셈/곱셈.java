import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int c = Integer.parseInt(a);
        for (int i = b.length(); i != 0; i--) {
          System.out.println(c * (b.charAt(i-1) - '0'));
        }
        System.out.println(c * Integer.parseInt(b));
  }
}
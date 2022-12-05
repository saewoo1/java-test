import java.util.Scanner;

public class Main{
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (second == third && third == first) {
          System.out.print(10000 + first * 1000);
        } else if (first == second || first == third) {
          System.out.print(1000 + first * 100);
        } else if (second == third) {
          System.out.print(1000 + second * 100);
        }else {
          System.out.print(Math.max(first, Math.max(second, third)) * 100);
        }
      }
}
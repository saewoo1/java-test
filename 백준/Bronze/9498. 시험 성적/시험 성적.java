import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String score1 = scanner.nextLine();
        int score = Integer.parseInt(score1);

        switch (score / 10) {
          case 10:
          case 9:
            System.out.print("A");
            break;
          case 8:
            System.out.println("B");
            break;
          case 7:
            System.out.print("C");
            break;
          case 6:
            System.out.print("D");
            break;
          default:
            System.out.println("F");
    }
  }
}
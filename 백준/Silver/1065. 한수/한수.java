import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    hansoo hansoo = new hansoo();
    System.out.println(hansoo.counter(scanner.nextInt()));
  }
}

class hansoo {
  int counter(int x) {
    int count = 0;
    if (x < 100) {
      return x;
    } else {
      count = 99;
      for (int i = 100; i <= x; i++) {
        int hund = i / 100;
        int ten = (i / 10) % 10;
        int one = i % 10;

        if ((hund - ten) == (ten - one))
          count++;
      }
    }
    return count;
  }
}
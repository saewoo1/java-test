import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String testCase = scanner.nextLine();
    String upper = testCase.toUpperCase();
    int[] check = new int[26];
    int max = -1;
    char ch = '?';

    for (int i = 0; i < testCase.length(); i++) {
      check[upper.charAt(i) - 'A']++;
    }

    for (int i = 0; i < check.length; i++) {
      if (check[i] > max) {
        max = check[i];
        ch = (char)(i + 'A');
      } else if (check[i] == max) {
        ch = '?';
      }
    }
    System.out.print(ch);
  }
}

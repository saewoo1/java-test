import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] alpha = new int[26];
    Arrays.fill(alpha, -1);
    String word = scanner.nextLine();

    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      if (alpha[c - 'a'] == -1)
        alpha[c - 'a'] = i;
    }

    for (int val : alpha) {
      System.out.print(val + " ");
    }
  }
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCaseCount = scanner.nextInt();
    int[] numbers = new int[testCaseCount];
    int cnt = 0;

    for (int i = 0; i < testCaseCount; i++) {
      numbers[i] = scanner.nextInt();
    }
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 2; j <= numbers[i]; j++) {
        if (numbers[i] == 2) {
          cnt++;
          break;
        }
        if (numbers[i] == j)
          cnt++;
        if (numbers[i] % j == 0)
          break;
      }
    }
    System.out.println(cnt);
  }
}

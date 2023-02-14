import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCount = scanner.nextInt();
    boolean[][] arr = new boolean[100][100];
    int count = 0;
    int x,y = 0;

    for (int i = 0; i < testCount; i++) {
      x = scanner.nextInt();
      y = scanner.nextInt();
      for (int j = x; j < x + 10; j++) {
        for (int k = y; k < y + 10; k++) {
          arr[j][k] = true;
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j])
          count++;
      }
    }
    System.out.println(count);
  }
}

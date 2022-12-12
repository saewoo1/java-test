import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    StringBuilder str = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    int limit = scanner.nextInt();

    int[] arr = new int[count];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
    }
    for (int j : arr) {
      if (j < limit) {
        str.append(j);
        str.append(" ");
      }
    }
    System.out.println(str);
  }
}
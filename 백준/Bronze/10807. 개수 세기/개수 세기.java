import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = scanner.nextInt();
    int[] arr = new int[count];
    int a = 0;
    for (int i = 0; i < count; i++) {
      arr[i] = scanner.nextInt();
    }
    int findNum = scanner.nextInt();

    for (int i = 0; i < count; i++) {
      if (arr[i] == findNum) {
        a++;
      }
    }
    System.out.print(a);
  }
}
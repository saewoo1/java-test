import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int testCount = scanner.nextInt();
    int[] arr = new int[testCount];

    for (int i = 0; i < testCount; i++) {
      arr[i] = scanner.nextInt();
    }
    for (int i = 0; i < testCount - 1; i++) {
      int minIdx = i;
      int before = arr[i];
      for (int j = i + 1; j < testCount; j++) {
        if (arr[j] < arr[minIdx])
          minIdx = j;
      }
      arr[i] = arr[minIdx];
      arr[minIdx] = before;
    }
    for (int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    }
  }
}

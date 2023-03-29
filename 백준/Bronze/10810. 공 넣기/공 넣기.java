import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String num = scanner.nextLine();
    StringTokenizer stringTokenizer = new StringTokenizer(num);
    int last = Integer.parseInt(stringTokenizer.nextToken());
    int count = Integer.parseInt(stringTokenizer.nextToken());
    int[] arr = new int[last + 1];

    for (int i = 0; i < count; i++) {
      String s = scanner.nextLine();
      StringTokenizer numbs = new StringTokenizer(s);
      int first = Integer.parseInt(numbs.nextToken());
      int second = Integer.parseInt(numbs.nextToken());
      int third = Integer.parseInt(numbs.nextToken());
      for (int j = first; j <= second; j++)
        arr[j] = third;
    }
    for (int i = 1; i < arr.length; i++)
    {
      System.out.print(arr[i] + " ");
    }
  }
}
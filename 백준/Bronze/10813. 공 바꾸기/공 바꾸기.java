import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    StringTokenizer stringTokenizer = new StringTokenizer(s);
    int last = Integer.parseInt(stringTokenizer.nextToken());
    int count = Integer.parseInt(stringTokenizer.nextToken());
    int[] ints = new int[last + 1];
    for (int i = 0; i < ints.length; i++)
      ints[i] = i;
    for (int i = 0; i < count; i++)
    {
      StringTokenizer stringTokenizer1 = new StringTokenizer(scanner.nextLine());
      int first = Integer.parseInt(stringTokenizer1.nextToken());
      int second = Integer.parseInt(stringTokenizer1.nextToken());
      int tmp = 0;
      tmp = ints[first];
      ints[first] = ints[second];
      ints[second] = tmp;
    }
    for (int i = 1; i < ints.length; i++) {
      System.out.printf(ints[i] + " ");
    }
  }
}
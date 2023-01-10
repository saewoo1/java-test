import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int group = 0;
    int res = 0;
    int i = 0;
    int bottom = 1;
    int top = 1;

    while (true) {
      if (num <= res) {
        break;
      }
      group++;
      res += group;
    }
    i = num - (res - group);
    if (group % 2 == 1) {
      top = group;
      for (int j = 1; j < i; j++) {
        top--;
        bottom++;
      }
    } else {
      bottom = group;
      for (int j = 1; j < i; j++) {
        bottom--;
        top++;
      }
    }
    System.out.println(top + "/" + bottom);
  }
}

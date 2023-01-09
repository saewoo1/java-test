import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int num = scanner.nextInt();
    int floor = 1;
    int start = 2;
    if (num == 1) {
      System.out.println(floor);
    } else {
      while (start <= num) {
        start += (floor * 6);
        floor++;
      }
        System.out.println(floor);
    }
  }
}

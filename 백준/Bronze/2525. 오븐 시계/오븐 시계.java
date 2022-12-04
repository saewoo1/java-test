import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int hour = scanner.nextInt();
    int minute = scanner.nextInt();
    int time = scanner.nextInt();
    int add = minute + time;

    if (add >= 60) {
      hour += (add / 60);
      if (hour >= 24) {
        hour -= 24;
      }
      while (add >= 60) {
        add -= 60;
      }
      minute = add;
    } else {
      minute += time;
    }
    System.out.print(hour + " " + minute);
  }  
}
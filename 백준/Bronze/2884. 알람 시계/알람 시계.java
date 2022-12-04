import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        
        if (hour == 0 && minute < 45) {
            hour = 23;
            minute += 15;
        } else if (minute < 45) {
            hour -= 1;
            minute += 15;
        } else {
            minute -= 45;
        }
        System.out.print(hour + " " + minute);
    }
}
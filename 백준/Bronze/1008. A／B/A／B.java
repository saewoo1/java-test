import java.util.Scanner;

public class Main{
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.printf("%.9f", (double)a / b);
    }
}
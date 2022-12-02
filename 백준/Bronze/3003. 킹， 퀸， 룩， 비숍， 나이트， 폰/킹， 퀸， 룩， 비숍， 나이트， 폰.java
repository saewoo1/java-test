import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] count = new int[6];
        int[] answer = {1, 1, 2, 2, 2, 8};
        
        for (int i = 0; i < count.length; i++) {
            count[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < count.length; i++) {
            System.out.print(answer[i] - count[i] + " ");
        }
    }
}
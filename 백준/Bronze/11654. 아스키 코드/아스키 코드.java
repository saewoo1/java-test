import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidTest validTest = new ValidTest();
        
        String input = scanner.nextLine();
        System.out.println(validTest.validReturn(input));
    }
}

class ValidTest {
    int validReturn(String input) {
        return input.charAt(0);
    }
}
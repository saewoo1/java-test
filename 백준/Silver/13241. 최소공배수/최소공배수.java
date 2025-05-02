import java.util.*;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        
        System.out.println(getLcm(a, b));
    }
    public static long getGcd(long a, long b) {
        if (b == 0) return a;
        return getGcd(b, a % b);
    }
    public static long getLcm(long a, long b) {
        return (a / getGcd(a, b)) * b;
    }
}
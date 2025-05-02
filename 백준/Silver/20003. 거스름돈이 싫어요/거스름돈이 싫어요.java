import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // 분자와 분모 배열 초기화
        long[] numerators = new long[n];
        long[] denominators = new long[n];
        
        // 모든 분수 읽고 기약분수로 변환
        for (int i = 0; i < n; i++) {
            long num = scanner.nextLong();
            long den = scanner.nextLong();
            
            // 기약분수로 변환
            long g = gcd(num, den);
            numerators[i] = num / g;
            denominators[i] = den / g;
        }
        
        // n=1인 경우 바로 출력
        if (n == 1) {
            System.out.println(numerators[0] + " " + denominators[0]);
            return;
        }
        
        // 처음 두 분수로 시작
        long resultGcd = gcd(numerators[0], numerators[1]);
        long resultLcm = lcm(denominators[0], denominators[1]);
        
        // 나머지 분수 처리
        for (int i = 2; i < n; i++) {
            resultGcd = gcd(resultGcd, numerators[i]);
            resultLcm = lcm(resultLcm, denominators[i]);
        }
        
        // 최종 결과 기약분수로 변환
        long g = gcd(resultGcd, resultLcm);
        resultGcd /= g;
        resultLcm /= g;
        
        System.out.println(resultGcd + " " + resultLcm);
    }
    
    // 최대공약수 계산
    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    
    // 최소공배수 계산
    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
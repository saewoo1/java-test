import java.util.*;

class Solution {
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public int solution(int a, int b) {
        int dividor = gcd(a, b);
        int mom = b / dividor;
        List<Integer> factors = new ArrayList<>();
        while (mom % 2 == 0) {
            factors.add(2);
            mom /= 2;
        }
        for (int i = 3; i <= Math.sqrt(mom); i += 2) {
            while (mom % i == 0) {
                factors.add(i);
                mom /= i;
            }
        }
        if (mom > 2) {
            factors.add(mom);
        }
        for (int number : factors) {
            if (number != 2 && number != 5) {
                return 2;
            }
        }
        return 1;
    }
}
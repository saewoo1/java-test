import java.util.*;

class Solution {
    public int[] solution(int n) {
        if (n < 2) return new int[0];
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                set.add(i);
            }
        }
        int[] answer = set.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        Arrays.sort(answer);
        return answer;
    }
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
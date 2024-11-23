import java.util.*;

class Solution {
    public static Set<Integer> uniquePrime = new HashSet<>();
    
    public int solution(String numbers) {
        boolean[] visited = new boolean[numbers.length()];
        
        for (int i = 1; i <= numbers.length(); i++) {
            permutation(numbers, visited, 0, i, "");
        }
        return uniquePrime.size();
    }
    
    public static void permutation(String numbers, boolean[] visited, int depth, int len, String current) {
        if (depth == len) {
            int number = Integer.parseInt(current);
            if (isPrime(number)) {
                uniquePrime.add(number);
            }
        }
        
        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                permutation(numbers, visited, depth + 1, len, current + numbers.charAt(i));
                visited[i] = false;
            }
        }
    }
    
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> sums = new HashSet<>();
        // 연속 길이
        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = 0; k < i; k++) {
                    sum += elements[(j + k) % elements.length];
                }
                sums.add(sum);
            }
        }
        
        return sums.size();
    }
}
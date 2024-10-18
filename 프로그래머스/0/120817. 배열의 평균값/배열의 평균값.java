import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = Arrays.stream(numbers).sum();
        
        return (double)sum / numbers.length;
    }
}
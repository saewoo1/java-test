import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] result = s.split(" ");
        int[] numbers = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            int number = Integer.parseInt(result[i]);
            numbers[i] = number;
        }
        Arrays.sort(numbers);
        
        return new String(numbers[0] + " " + numbers[numbers.length - 1]);
    }
}
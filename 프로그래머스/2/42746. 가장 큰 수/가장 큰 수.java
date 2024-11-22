import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder result = new StringBuilder();
        String[] number = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            number[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(number, (a, b) -> (b + a).compareTo(a + b));
        for (int i = 0; i < number.length; i++) {
            result.append(number[i]);
        }
        if (number[0].charAt(0) == '0') {
            return "0";
        }
        return result.toString();
    }
}
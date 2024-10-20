import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] number = 
                {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Map<String, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            numberMap.put(number[i], i);
        }
        StringBuilder result = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        
        for (char c : numbers.toCharArray()) {
            tmp.append(c);
            if (numberMap.containsKey(tmp.toString())) {
                result.append(numberMap.get(tmp.toString()));
                tmp.setLength(0);
            }
        }
        
        return Long.parseLong(result.toString());
    }
}
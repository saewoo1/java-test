import java.util.*;

class Solution {
    
    public int[] toBinary(int number, int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = number % 2;
            number /= 2;
        }
        return result;
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            int[] line1 = toBinary(arr1[i], n);
            int[] line2 = toBinary(arr2[i], n);
            
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < line1.length; j++) {
                if (line1[j] == 0 && line2[j] == 0) {
                    sb.append(' ');
                }
                else {
                    sb.append('#');
                }
            }
            answer[i] = sb.reverse().toString();
        }
        return answer;
    }
}
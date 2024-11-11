import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        for (int i = 0; i < X.length(); i++) {
            xArr[X.charAt(i) - '0']++;
        }
        for (int i = 0; i < Y.length(); i++) {
            yArr[Y.charAt(i) - '0']++;
        }
        
        for (int i = 9; i >= 0; i--) {
            int count = Math.min(xArr[i], yArr[i]);
            for (int j = 0; j < count; j++) {
                answer.append(i);
            }
        }
        if (answer.length() == 0) {
            return "-1";
        }
        if (answer.charAt(0) == '0') {
            return "0";
        }
        return answer.toString();
    }
}
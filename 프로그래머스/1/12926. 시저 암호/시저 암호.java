import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        char[] alpha = s.toCharArray();
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] == ' ') {
                answer.append(alpha[i]);
                continue;
            }
            if (Character.isLowerCase(alpha[i])) {
                // 소문자일 경우
                if (alpha[i] + n > 'z') {
                    answer.append((char) (alpha[i] + n - 26));
                } else {
                    answer.append((char) (alpha[i] + n));
                }
            }
            if (Character.isUpperCase(alpha[i])) {
                if (alpha[i] + n > 'Z') {
                    answer.append((char) (alpha[i] + n - 26));
                } else {
                    answer.append((char) (alpha[i] + n));
                }
            }
        }
        return answer.toString();
    }
}
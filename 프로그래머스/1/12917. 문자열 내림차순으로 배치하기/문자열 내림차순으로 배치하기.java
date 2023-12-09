import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        StringBuilder sb = new StringBuilder(new String(charArray));
        answer = sb.reverse().toString();
        return answer;
    }
}
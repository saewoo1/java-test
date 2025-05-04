import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            int oddLen = expandFromCenter(s, i, i);
            int evenLen = expandFromCenter(s, i, i + 1);
            int len = Math.max(oddLen, evenLen);
            
            answer = Math.max(answer, len);
        }
        

        return answer;
    }
    
    public int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
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
            
            answer = Math.max(len, answer);
        }

        return answer;
    }
    
    public int expandFromCenter(String s, int left, int right) {
        // left, right가 인덱스 범위를 벗어나지 않고, 두 char가 같은 값이라면
        while (left >= 0 && right < s.length() 
               && s.charAt(left) == s.charAt(right)) {
            // 시작점부터 점점 퍼져나가면서 검수 진행
            left--;
            right++;
        }
        return right - left - 1;
    }
}
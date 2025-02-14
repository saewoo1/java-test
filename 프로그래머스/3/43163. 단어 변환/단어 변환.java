import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        if (!isContains(target, words)) {
            return 0;
        }
        
        for (String word : words) {
            if (isChangedOnlyOne(begin, target)) {
                return answer + 1;
            }
            if (isChangedOnlyOne(begin, word)) {
                begin = word;
                answer++;
            }
            
            if (begin.equals(target)) {
                return answer;
            }
        }
        return 0;
    }
    
    public boolean isChangedOnlyOne(String begin, String target) {
        if (begin.length() != target.length()) {
            return false;
        }
        int diffCount = 0;
        
        for (int i = 0; i < begin.length(); i++) {
            if (begin.charAt(i) != target.charAt(i)) {
                diffCount++;
            }
            if (diffCount > 1) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isContains(String target, String[] words) {
        boolean flag = false;
        for (String word : words) {
            if (word.equals(target)) {
                flag = true;
            }
        }
        return flag;
    }
}
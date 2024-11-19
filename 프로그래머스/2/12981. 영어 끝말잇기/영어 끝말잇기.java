import java.util.*;

class Solution {
    /*
    1. 앞 사람의 끝 알파벳으로 시작한다
    2. 중복 금지
    3. 한 글자 이상
    
    4. 몇 번 사람이, 몇 번 회전만에 탈락하나?
    */
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Stack<String> usedWords = new Stack<>();
        for (int i = 0; i < words.length; i++) {
            String current = words[i];
            if (!usedWords.isEmpty()) {
                if (!isValidWord(usedWords.peek(), current) || usedWords.contains(current)) {
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    return answer;
                }
            }
            usedWords.push(current);
        }
        return new int[]{0, 0};
    }
    
    public boolean isValidWord(String prev, String current) {
        if (current.length() < 2) {
            return false;
        }
        if (prev.charAt(prev.length() - 1) != current.charAt(0)) {
            return false;
        }
        return true;
    }
}
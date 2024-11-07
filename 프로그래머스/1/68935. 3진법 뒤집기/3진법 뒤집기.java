import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> third = new ArrayList<>();
        while (n > 0) {
            third.add(n % 3);
            n /= 3;
        }
        for (int i = 0; i < third.size(); i++) {
            answer = answer * 3 + third.get(i);
        }
        
        return answer;
    }
}
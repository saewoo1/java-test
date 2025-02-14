import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        // 서로 다른 옷의 조합 개수?
        Map<String, String> closet = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            closet.put(clothes[i][0], clothes[i][1]);
        }
        
        answer += closet.size();
        
        return answer;
    }
}
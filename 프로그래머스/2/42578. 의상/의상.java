import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        // 서로 다른 옷의 조합 개수?
        Map<String, Integer> closet = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            String clothe = clothes[i][0];
            
            closet.put(type, closet.getOrDefault(type, 0) + 1);
        }
        for (String key : closet.keySet()) {
            answer *= closet.get(key) + 1;
        }
        
        
        return answer - 1;
    }
}
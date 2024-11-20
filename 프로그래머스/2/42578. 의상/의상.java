import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> closet = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String clothe = clothes[i][1];
            closet.put(clothe, closet.getOrDefault(clothe, 0) + 1);
        }
        
        for (String s : closet.keySet()) {
            answer *= closet.get(s) + 1;
        }
        return answer - 1;
    }
}
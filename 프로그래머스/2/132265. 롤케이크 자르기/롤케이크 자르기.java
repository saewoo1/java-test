import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> cake1 = new HashMap<>();
        Map<Integer, Integer> cake2 = new HashMap<>();
        
        // cake2에 모든 요소들을 넣어둔다
        for (Integer top : topping) {
            cake2.put(top, cake2.getOrDefault(top, 0) + 1);
        }
        
        for (int i = 0; i < topping.length; i++) {
            int top = topping[i];
            // cake2에서 일단 빼고
            cake2.put(top, cake2.get(top) - 1);
            // cake1에 더하기
            cake1.put(top, cake1.getOrDefault(top, 0) + 1);
            
            if (cake2.get(top) == 0) {
                cake2.remove(top);
            }
            
            if (cake1.size() == cake2.size()) {
                answer++;
            }    
        }
        return answer;
    }
}
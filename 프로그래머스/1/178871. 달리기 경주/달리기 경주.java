import java.util.*;

// 일등부터 순서대로 넣어다오
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            counter.put(players[i], i);
        }
        
        for (String calling : callings) {
            int rank = counter.get(calling); // 이름 불린사람 현재 등수
            String prev = players[rank - 1];
            
            players[rank] = prev;
            players[rank - 1] = calling;
            
            counter.put(prev, rank);
            counter.put(calling, rank - 1);
        }
        return players;
    }
}
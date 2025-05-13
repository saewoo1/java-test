import java.util.*;

class Solution {
    static class Server {
        // 현 시점에서 돌고있는 대수
        int count;
        // 반환되는 시간
        int end;
        
        public Server(int count, int end) {
            this.count = count;
            this.end = end;
        }
    }
    
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        Queue<Server> currentServers = new ArrayDeque<>();
        // 24시간동안 돌 때, 최소 몇 대의 서버가 더 증설되어야 할까?
        for (int i = 0; i < 24; i++) {
            // 지금 당장 돌아야하는 서버의 대수
            int need = players[i] / m;
            
            // 가동 끝난 애들은 모두 버린다
            while (!currentServers.isEmpty()
                  && currentServers.peek().end <= i) {
                currentServers.poll();
            }
            // 회수 끝난 후, 그래서 지금 몇대 돌고 있음?
            int currentCount = 
                currentServers.stream().mapToInt(e -> e.count).sum();
            // 만약 더 증설해야한다면
            if (currentCount < need) {
                int count = need - currentCount;
                currentServers.add(new Server(count, i + k));
                answer += count;
            }
        }
        return answer;
    }
}
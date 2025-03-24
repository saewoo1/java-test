import java.util.*;

class Server {
    int end;
    int count;
    public Server(int end, int count) {
        this.end = end;
        this.count = count;
    }
}
class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        Queue<Server> activeServers = new ArrayDeque<>();
        for (int i = 0; i < 24; i++) {
            int need = players[i] / m;
            
            while (!activeServers.isEmpty() 
                   && activeServers.peek().end <= i) {
                activeServers.poll();
            }
            int currentServerCount = activeServers.stream()
                .mapToInt(e -> e.count).sum();
            if (currentServerCount < need) {
                int newServerCount = need - currentServerCount;
                activeServers.add(new Server(i + k, newServerCount));
                answer += newServerCount;
            }
        }
        return answer;
    }
}
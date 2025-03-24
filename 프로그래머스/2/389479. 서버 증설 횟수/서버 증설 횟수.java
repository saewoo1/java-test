/*
동시간대 이용자 m명이 늘어날 때마다 증설++
m 미만이라면 증설 안함
n * m명 이상 (n + 1) * m명 미만이라면
최소 n대 증설 서버.

1회 증설 시 k시간만큼 운영후 반납
모든 게임 이용자가 게임을하기 위해서는, 최소 몇 번 증설해야하나?


int limit = person / m;
*/
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
        int count = 0;
        
        PriorityQueue<Server> activeServers = 
            new PriorityQueue<>((a, b) -> a.end - b.end);
        
        for (int i = 0; i < 24; i++) {
            // 현 시간대 증설해야하는 개수
            int need = players[i] / m;
            
            // 시간 종료된 서버 회수
            while (!activeServers.isEmpty() && activeServers.peek().end <= i) {
                activeServers.poll();
            }
            int currentServerCount = 
                activeServers.stream().mapToInt(s -> s.count).sum();
            
            if (currentServerCount < need) {
                // 새로 증설해야하는 개수
                int newServer = need - currentServerCount;
                activeServers.add(new Server(i + k, newServer));
                answer += newServer;
            }
        }
        return answer;
    }
}
import java.util.*;

public class Main {
    static class Node {
        int y, x;
        public Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
    
    static int n,m;
    static int[][] graph;
    static int[][] dist;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        graph = new int[n + 2][m + 2];
        dist = new int[n + 2][m + 2];
        Queue<Node> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                graph[i][j] = scanner.nextInt();
                if (graph[i][j] == 1) {
                    queue.add(new Node(i, j));
                    dist[i][j] = 0;
                } else if (graph[i][j] == 0) {
                    dist[i][j] = -1;
                }
            }
        }
        
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            int curX = cur.x;
            int curY = cur.y;
            for (int i = 0; i < 4; i++) {
                int newX = curX + dx[i];
                int newY = curY + dy[i];
                
                if (newX < 1 || newX > m || newY < 1 || newY > n) {
                    continue;
                }
                if (dist[newY][newX] != -1) { // 이미 방문했거나 안익은 토마토 없음
                    continue;
                }
                dist[newY][newX] = dist[curY][curX] + 1;
                queue.add(new Node(newY, newX));
            }
        }
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= m; j++) {
                if (dist[i][j] == -1) {
                    System.out.println(-1);
                    return ;
                }
                if (dist[i][j] >= 0) {
                    answer = Math.max(answer, dist[i][j]);
                }
            }
        }
        System.out.println(answer);
    }
}
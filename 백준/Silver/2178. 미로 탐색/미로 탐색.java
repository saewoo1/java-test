import java.util.*;

public class Main{
    static class Node {
        public int x, y;
        
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    static int n, m;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int[][] graph;
    static boolean[][] visited;
    static int result;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        
        graph = new int[n + 2][m + 2];
        visited = new boolean[n + 2][m + 2];
        
        // 그래프 채워넣기
        for (int i = 1; i <= n; i++) {
            String line = scanner.next();
            for (int j = 1; j <= m; j++) {
                
                graph[i][j] = line.charAt(j - 1) - '0';
            }
        }
        if (graph[1][1] == 1) {
            bfs(1, 1);
            System.out.println(graph[n][m]);
            return;
        }
        System.out.println(-1);
    }
    
    public static void bfs(int y, int x) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(new Node(x, y));
        visited[y][x] = true;
        int size = 1;
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            int curX = current.x;
            int curY = current.y;
            
            for (int i = 0; i < 4; i++) {
                int newY = curY + dy[i];
                int newX = curX + dx[i];
                
                if (newY < 1 || newY > n || newX < 1 || newX > m || visited[newY][newX] || graph[newY][newX] == 0) {
                    continue;
                }
                queue.add(new Node(newX, newY));
                visited[newY][newX] = true;
                graph[newY][newX] = graph[curY][curX] + 1;
            }
        }
    }
    
}
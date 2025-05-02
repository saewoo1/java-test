import java.util.*;

public class Main{
    static int n, m;
    static boolean[][] visited;
    static int[][] graph;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        visited = new boolean[n+2][m+2];
        graph = new int[n+2][m+2];
        int count = 0;
        int size = 0;
        
        // 그래프 채워넣기
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // 그림이고, 방문한 적 없다면
                if (graph[i][j] == 1 && !visited[i][j]) {
                    count++;
                    size = Math.max(bfs(i, j), size);
                }
            }
        }
        System.out.println(count);
        System.out.println(size);
    }
    public static int bfs(int y, int x) {
        int size = 1;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{y, x});
        visited[y][x] = true;
        
        while (!queue.isEmpty()) {
            int[] xy = queue.poll();
            int curX = xy[1];
            int curY = xy[0];
            
            for (int i = 0; i < 4; i++) {
                int newX = curX + dx[i];
                int newY = curY + dy[i];
                
                if (newX > m || newX < 1 || newY < 1 || newY > n || visited[newY][newX] || graph[newY][newX] != 1) {
                    continue;
                }
                visited[newY][newX] = true;
                queue.add(new int[]{newY, newX});
                size++;
            }
        }
        return size;
    }
    
}
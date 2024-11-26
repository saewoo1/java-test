import java.util.*;

public class Main {
    public static int N;
    public static int[][] graph;
    public static boolean[][] visited;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        N = scanner.nextInt();
        graph = new int[N + 2][N + 2];
        visited = new boolean[N + 2][N + 2];
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println(bfs(1,1) ? "HaruHaru" : "Hing");
    }
    
    public static boolean bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{y, x});
        visited[y][x] = true;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            if (current[0] == N && current[1] == N) {
                return true;
            }
            int jump = graph[current[0]][current[1]];
            int[][] dirs = {{jump, 0}, {0, jump}};
            for (int[] dir : dirs) {
                int nextY = current[0] + dir[0];
                int nextX = current[1] + dir[1];
                if (nextY <= N && nextX <= N && !visited[nextY][nextX]) {
                    visited[nextY][nextX] = true;
                    queue.offer(new int[]{nextY, nextX});
                }
            }
        }
        
        return false;
    }
}
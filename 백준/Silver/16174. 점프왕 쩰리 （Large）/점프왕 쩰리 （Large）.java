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
        
        System.out.println(dfs(1,1) ? "HaruHaru" : "Hing");
    }
    
    public static boolean dfs(int y, int x) {
        visited[y][x] = true;
        if (y == N && x == N) {
            return true;
        }
        
        int jumpCount = graph[y][x];
        if (jumpCount == 0) {
            return false;
        }
        int nextY = y + jumpCount;
        int nextX = x + jumpCount;
        if (nextY <= N && !visited[nextY][x]) {
            if (dfs(nextY, x)) {
                return true;
            }
        }
        
        if (nextX <= N && !visited[y][nextX]) {
            if (dfs(y, nextX)) {
                return true;
            }
        }
        return false;
    }
}
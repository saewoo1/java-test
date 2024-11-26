import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int M = scanner.nextInt();
        
        boolean[][] graph = new boolean[N + 1][N + 1];
        boolean[] visited = new boolean[N + 1];
        
        // 그래프 정보 주입
        for (int i = 0; i < M; i++) {
            int y = scanner.nextInt();
            int x = scanner.nextInt();
            
            graph[y][x] = true;
            graph[x][y] = true;
        }
        
        
        int result = dfs(start, 0, end, graph, visited);
        System.out.println(result);
    }
    
    public static int dfs(int current, int depth, int target, boolean[][] graph, boolean[] visited) {
        visited[current] = true;
        
        if (current == target) {
            return depth;
        }
        for (int i = 1; i < visited.length; i++) {
            // 방문한 적 없고, 연결된 곳이라면
            if (!visited[i] && graph[current][i]) {
                int result = dfs(i, depth + 1, target, graph, visited);
                if (result != -1) {
                    return result;
                }
            }
        }
        return -1;
    } 
}
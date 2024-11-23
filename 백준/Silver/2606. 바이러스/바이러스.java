import java.util.*;

public class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int m, n;
    static int answer;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 컴퓨터의 수
        n = scanner.nextInt();
        // 몇쌍이게
        m = scanner.nextInt();
        graph = new boolean[n + 1][n + 1];
        visited = new boolean[n + 1];
        
        int x, y;
        for (int i = 0; i < m; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            
            graph[x][y] = true;
            graph[y][x] = true;
        }
        dfs(1);
        System.out.println(answer - 1);
    }
    
    public static void dfs(int idx) {
        // 방문 처리
        answer++;
        visited[idx] = true;
        
        for (int i = 1; i <= n; i++) {
            if (!visited[i] && graph[idx][i]) {
                dfs(i);
            }
        }
    }
}
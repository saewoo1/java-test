import java.util.*;

public class Main {
    static char[][] graph;
    static boolean[][] visited;
    
    static int N;
    static int M;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        scanner.nextLine();
        graph = new char[N + 2][M + 2];
        visited = new boolean[N + 2][M + 2];
        for (int i = 1; i <= N; i++) {
            String line = scanner.nextLine();
            for (int j = 1; j <= M; j++) {
                graph[i][j] = line.charAt(j - 1);
            }
        }
        
        int wood = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, graph[i][j]);
                    wood++;
                }
            }
        }
        System.out.println(wood);
    }
    
    public static void dfs(int y, int x, char type) {
        visited[y][x] = true;
        
        if (type == '-') {
            if (!visited[y][x + 1] && graph[y][x + 1] == type) {
                dfs(y, x + 1, type);
            }
        }
        if (type == '|') {
            if (!visited[y + 1][x] && graph[y + 1][x] == type) {
                dfs(y + 1, x, type);
            }
        }
    }
}
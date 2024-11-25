import java.util.*;

public class Main {
    
    static int N;
    static int M;
    static boolean[][] graph;
    static boolean[] visited;
    static int visitCounter;
    static List<Integer> counter = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];
        
        scanner.nextLine();
        // 그래프 정보 넣기
        for (int i = 0; i < M; i++) {
            String[] lines = scanner.nextLine().split(" ");
            int y = Integer.parseInt(lines[0]);
            int x = Integer.parseInt(lines[1]);
            
            graph[y][x] = true;
            graph[x][y] = true;
        }
        for (int i = 1; i <= N; i++) {
            // 해당 간선을 탐색한 적이 없다면 
            if (!visited[i]) {
                dfs(i);
                visitCounter++;
            }
        }
        
        System.out.println(visitCounter);
    }
    
    public static void dfs(int start) {
        visited[start] = true;
        
        for (int i = 1; i < N + 1; i++) {
            if (!visited[i] && graph[start][i]) {
                dfs(i);
            }
        }
    }
}
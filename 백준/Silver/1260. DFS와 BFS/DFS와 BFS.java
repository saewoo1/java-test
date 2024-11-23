import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        
        // 지점 수
        int n = Integer.parseInt(firstLine[0]);
        // 이어진 갯수
        int m = Integer.parseInt(firstLine[1]);
        // 시작점
        int v = Integer.parseInt(firstLine[2]);
        boolean[][] graph = new boolean[n + 1][n + 1];
        boolean[] visited = new boolean[n + 1];
        
        // 이어진 부분 그래프로 표기
        for (int i = 1; i <= m; i++) {
            String[] lines = scanner.nextLine().split(" ");
            int start = Integer.parseInt(lines[0]);
            int end = Integer.parseInt(lines[1]);
            
            graph[start][end] = true;
            graph[end][start] = true;
        }
        StringBuilder sb = new StringBuilder();
        dfs(graph, visited, v, sb);
        System.out.println(sb.toString().trim());
        
        sb = new StringBuilder();
        bfs(graph, visited, v, sb);
        System.out.println(sb.toString().trim());
    }
    
    public static void dfs(boolean[][] graph, boolean[] visited, int current, StringBuilder sb) {
        // 방문 표기
        visited[current] = true;
        sb.append(current).append(" ");
        
        // 1부터 (m 자체가 0부터 시작)
        for (int i = 1; i < visited.length; i++) {
            // 가려는 곳이 방문한 적이 없고, 이어져있다면
            if (!visited[i] && graph[current][i]) {
                // 다음으로 ㄱㄱ
                dfs(graph, visited, i, sb);
            }
        }
    }
    
    public static void bfs(boolean[][] graph, boolean[] visited, int start, StringBuilder sb) {
        // 방문할 곳
        Queue<Integer> queue = new LinkedList<>();
        // bfs에서 썼던거 쌀먹점
        visited = new boolean[visited.length];
        // 시작점 방문, 처음부분 세팅
        queue.add(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            sb.append(current).append(" ");
            for (int i = 1; i < visited.length; i++) {
                if (!visited[i] && graph[current][i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
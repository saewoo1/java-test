class Solution {
    static boolean[][] graph;
    static boolean[] visited;
    static int count;
    
    public int solution(int n, int[][] computers) {
        graph = new boolean[n + 2][n + 2];
        visited = new boolean[n + 2];
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (computers[i - 1][j - 1] == 1 ) {
                    graph[i][j] = true;
                    graph[j][i] = true;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i, n);
                count++;
            }
        }
        return count;
    }
    
    public static void dfs(int current, int target) {
        // current번째 컴퓨터 방문
        visited[current] = true;
        
        for (int i = 1; i <= target; i++) {
            if (!visited[i] && graph[current][i]) {
                dfs(i, target);
            }
        }
        
    }
}
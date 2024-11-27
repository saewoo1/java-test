import java.util.*;

class Solution {
    static int answer = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(dungeons, visited, answer, k);
        return answer;
    }
    
    public static void dfs(int[][] dungeons, boolean[] visited, int count, int current) {
        
        answer = Math.max(answer, count);
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] 
                && dungeons[i][0] <= current && dungeons[i][1] <= current) {
                visited[i] = true;
                dfs(dungeons, visited, count + 1, current - dungeons[i][1]);
                visited[i] = false;
            }
        }
    }
}
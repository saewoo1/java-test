import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        
        answer = bfs(visited, maps, n, m);
        return answer;
    }
    
    public int bfs(boolean[][] visited, int[][] maps, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;
        int[] dirR = {1,-1,0,0};
        int[] dirC = {0,0,1,-1};
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int y = current[0];
            int x = current[1];
            int distance = current[2];
            
            // 끝에 도달했으면 distance 반환하기
            if (y == n - 1 && x == m - 1) {
                return distance;
            }
            
            for (int i = 0; i < 4; i++) {
                int newY = dirR[i] + y;
                int newX = dirC[i] + x;
                
                if (((newY >= 0 && newY < n) && (newX >= 0 && newX < m)) 
                    && (!visited[newY][newX] && maps[newY][newX] == 1)) {
                    visited[newY][newX] = true;
                    queue.add(new int[]{newY, newX, distance + 1});
                }
            }
        }
        return -1;
    }
}
import java.util.*;

class Solution {
    boolean[][] visited;
    int n;
    int m;
    
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        int[] dirR = {1, -1, 0, 0};
        int[] dirC = {0, 0, 1, -1};
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int y = current[0];
            int x = current[1];
            int distance = current[2];
            
            if (y == n - 1 && x == m - 1) {
                return distance;
            }
            
            for (int i = 0; i < 4; i++) {
                int newY = dirR[i] + y;
                int newX = dirC[i] + x;
                
                if ((newY >= 0 && newY < n) && (newX >= 0 && newX < m) 
                   && (maps[newY][newX] == 1 && !visited[newY][newX])) {
                    queue.add(new int[]{newY, newX, distance + 1});
                    visited[newY][newX] = true;
                }
            }
        }
        
        return -1;
    }
}
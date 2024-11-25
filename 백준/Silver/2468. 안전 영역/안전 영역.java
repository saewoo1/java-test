import java.util.*;

public class Main {
    static int[][] graph;
    static boolean[][] visited;
    static int N;
    static int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        
        graph = new int[N + 2][N + 2];
        
        // 그래프 정보 채우기
        int maxHeight = 0;
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                int number = scanner.nextInt();
                maxHeight = Math.max(number, maxHeight);
                graph[i][j] = number;
            }
        }
        
        // 수면 제한이 1부터 max까지 몇일 때 safeArea가 가장 큰지 검사
        int maxArea = 0;
        for (int h = 0; h <= maxHeight; h++) {
            maxArea = Math.max(maxArea, getArea(h));
        }
        
        System.out.println(maxArea);
    }
    
    public static int getArea(int h) {
        visited = new boolean[N + 2][N + 2];
        int area = 0;
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (!visited[i][j] && graph[i][j] > h) {
                    bfs(i, j, h);
                    area++;
                }
            }
        }
        return area;
    }
    
    public static void bfs(int y, int x, int h) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{y, x});
        visited[y][x] = true;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            
            for (int[] dir : dirs) {
                int nextY = dir[0] + current[0];
                int nextX = dir[1] + current[1];
                if (!visited[nextY][nextX] && graph[nextY][nextX] > h) {
                    queue.offer(new int[]{nextY, nextX});
                    visited[nextY][nextX] = true;
                }
            }
        }
    }
}
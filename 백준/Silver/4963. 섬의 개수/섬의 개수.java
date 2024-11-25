import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[][] graph;
    static boolean[][] visited;
    static int[][] dir = {{1,0}, {-1,0}, {0,-1}, {0,1},{1,1},{1,-1},{-1,1},{-1,-1}};
    static int answer;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> count = new ArrayList<>();
        
        while(true) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            if (m == 0 && n == 0) {
                break;
            }
            
            scanner.nextLine();
            // 그래프 정보 담기
            answer = 0;
            graph = new int[n + 2][m + 2];
            visited = new boolean[n + 2][m + 2];
            for (int i = 1; i < n + 1; i++) {
                String[] line = scanner.nextLine().split(" ");
                for (int j = 1; j < m + 1; j++) {
                    graph[i][j] = Integer.parseInt(line[j - 1]);
                }
            }
            
            // dfs 수행 1,1 부터 수행한다
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < m + 1; j++) {
                    if (!visited[i][j] && graph[i][j] == 1) {
                        answer++;
                        bfs(i, j);
                    }
                }
            }
            count.add(answer);
        }
        for (int i : count) {
            System.out.println(i);
        }
    }
    
    public static void bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        visited[y][x] = true;
        queue.add(new int[]{y, x});
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int[] next : dir) {
                int nextY = current[0] + next[0];
                int nextX = current[1] + next[1];
                if (!visited[nextY][nextX] && graph[nextY][nextX] == 1) {
                    visited[nextY][nextX] = true;
                    queue.add(new int[]{nextY, nextX});
                }
            }
        }
        
    }
}
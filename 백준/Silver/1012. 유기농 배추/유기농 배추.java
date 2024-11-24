import java.util.*;

public class Main {
    
    static int t;
    static int m, n, k;
    static boolean[][] graph;
    static boolean[][] visited;
    static int[] dirR = {1,-1,0,0};
    static int[] dirC = {0,0,1,-1};
    
    // 상하좌우 탐색 시작
    public static void dfs(int y, int x) {
        visited[y][x] = true;
        
        for (int idx = 0; idx < 4; idx++) {
            int newY = y + dirR[idx];
            int newX = x + dirC[idx];
            if (!visited[newY][newX] && graph[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        
        // 테스트 케이스 만큼 정보를 받아오는걸 수행한다.
        for (int idx = 0; idx < t; idx++) {
            m = scanner.nextInt();
            n = scanner.nextInt();
            k = scanner.nextInt();
            
            // m, n의 최대 값은 50이므로, 좀 더 넉넉하게
            graph = new boolean[60][60];
            visited = new boolean[60][60];
            
            // 그래프에 배추 위치에 대한 정보를 담는다
            int x, y;
            for (int cabbage = 0; cabbage < k; cabbage++) {
                x = scanner.nextInt();
                y = scanner.nextInt();
                // 0,0 기준이 아닌 1,1 시작을 기준으로 잡는다 (범위 벗어나는거 조건 걸기 귀찮)
                graph[y + 1][x + 1] = true;
            }
            
            // graph 전체를 순환하며 검수 진행
            int answer = 0;
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < m + 1; j++) {
                    // 해당 좌표를 방문한 적 없고, 배추가 심어져 있다면
                    if (!visited[i][j] && graph[i][j]) {
                        answer++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
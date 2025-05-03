import java.util.*;
public class Main {
    static class Node {
        int y, x;
        public Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
    
    static int n, m;
    static char[][] graph;
    static int[][] fireWay;
    static int[][] distinct;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        graph = new char[n + 2][m + 2]; // 보드
        fireWay = new int[n + 2][m + 2]; // 불이 전파되는 시간
        distinct = new int[n + 2][m + 2]; // 지훈이 이동하는데 걸리는 시간
        Queue<Node> jihoon = new ArrayDeque<>();
        Queue<Node> fire = new ArrayDeque<>();
        
        for (int i = 1; i <= n; i++) {
            String line = scanner.next();
            // 일단 -1로 다 채워
            Arrays.fill(distinct[i], -1);
            Arrays.fill(fireWay[i], -1);
            for (int j = 1; j <= m; j++) {
                char target = line.charAt(j - 1);
                // 그래프 채우기
                graph[i][j] = target;

                // 지훈, 불의 좌표 큐에 담기, 시작 지점은 0으로 표기
                if (target == 'J') {
                    jihoon.add(new Node(i, j));
                    distinct[i][j] = 0;
                }
                if (target == 'F') {
                    fire.add(new Node(i, j));
                    fireWay[i][j] = 0;
                }
            }
        }
        // 불 BFS 수행
        while (!fire.isEmpty()) {
            Node curFire = fire.poll();
            
            for (int i = 0; i < 4; i++) {
                int ny = curFire.y + dy[i];
                int nx = curFire.x + dx[i];
                
                // 범위 벗어났다면
                if (ny < 1 || ny > n || nx < 1 || nx > m) {
                    continue;
                }
                // 벽이거나, 이미 불이 번졌다면
                if (graph[ny][nx] == '#' || fireWay[ny][nx] != -1) {
                    continue;
                }
                fireWay[ny][nx] = fireWay[curFire.y][curFire.x] + 1;
                fire.add(new Node(ny, nx));
            }
        }
        
        while (!jihoon.isEmpty()) {
            Node cur = jihoon.poll();
            
            for (int i = 0; i < 4; i++) {
                int ny = cur.y + dy[i];
                int nx = cur.x + dx[i];
                
                // 다음 스텝이 탈출이면, 출력하고 끝내기
                if (ny < 1 || ny > n || nx < 1 || nx > m) {
                    System.out.println(distinct[cur.y][cur.x] + 1);
                    return;
                }
                // 벽이거나, 이미 왔던 데라면
                if (graph[ny][nx] == '#' || distinct[ny][nx] > 0) {
                    continue;
                }
                int nextTime = distinct[cur.y][cur.x] + 1;
                // 이미 불이 번졌다면
                if (fireWay[ny][nx] != -1 && fireWay[ny][nx] <= nextTime) {
                    continue;
                }
                
                distinct[ny][nx] = nextTime;
                jihoon.add(new Node(ny, nx));
            }
        }
        
        System.out.println("IMPOSSIBLE");
    }
}
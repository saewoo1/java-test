import java.util.*;

public class Main {
    static int n, m;
    static int[][] graph;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        graph = new int[n][m];
        
        // 그래프 채워넣기
        for (int i = 0; i < n; i++) {
            String line = scanner.next();
            for (int j = 0; j < m; j++) {
                graph[i][j] = line.charAt(j) - '0';
            }
        }
        
        // 정사각형 초기 길이
        int len = Math.min(n, m);
        // 큰거부터 찾기
        while (len > 1) {
            for (int i = 0; i <= n - len; i++) {
                for (int j = 0; j <= m - len; j++) {
                    int start = graph[i][j];
                    if (isSameEdge(i, j, start, len)) {
                        System.out.println(len * len);
                        return;
                    }
                }
            }
            len--;
        }
        System.out.println(len * len);
    }
    
    public static boolean isSameEdge(int y, int x, int num, int len) {
        len -=1;
        if (graph[y + len][x] == num && graph[y][x + len] == num && graph[y + len][x + len] == num) {
            return true;
        }
        return false;
    }
}
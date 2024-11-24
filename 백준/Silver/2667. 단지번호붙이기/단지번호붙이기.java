import java.util.*;

public class Main {
    static boolean[][] graph;
    static int n;
    static int[] dirR = {1,-1,0,0};
    static int[] dirC = {0,0,1,-1};
    static int home;
    
    public static void bfs(int y, int x) {
        home++;
        Queue<int[]> queue = new LinkedList<>();
        graph[y][x] = false;
        queue.add(new int[]{y, x});
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newY = current[0] + dirR[i];
                int newX = current[1] + dirC[i];
                if (graph[newY][newX]) {
                    graph[newY][newX] = false;
                    home++;
                    queue.add(new int[]{newY, newX});
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
       
        // 버퍼 비우기;? nextInt 후에 nextLine 쓰면 안된다내여,,
        scanner.nextLine();
        
        // n줄이 입력받게 된다. n * n 사이즈니까 여유분 + 2로 넉넉히 그래프 생성
        graph = new boolean[n + 2][n + 2];
        
        // 그래프에 정보 넣기
        for (int i = 1; i < n + 1; i ++) {
            String lines = scanner.nextLine();
            for (int j = 1; j < n + 1; j++) {
                
                // 테두리를 미리 쳐둬서 검사 진행 위치가 범위를 벗어나는지 검증하는 부분 생략
                if (lines.charAt(j - 1) == '0') {
                    graph[i][j] = false;
                }
                if (lines.charAt(j - 1) == '1') {
                    graph[i][j] = true;
                }
            }
        }
        
        // 그래프 순회하며 단지 내의 집 개수 세기
        // 단지 내의 집 개수 == 해당 위치에서 recursive가 호출된 횟수
        List<Integer> danji = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (graph[i][j]) {
                    home = 0;
                    bfs(i, j);
                    danji.add(home);
                }
            }
        }
        
        System.out.println(danji.size());
        Collections.sort(danji);
        for (int house : danji) {
            System.out.println(house);
        }
        
    }
}
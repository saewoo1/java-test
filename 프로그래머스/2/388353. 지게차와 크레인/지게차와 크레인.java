import java.util.*;
class Node {
    int x;
    int y;
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    String[][] map;
    boolean[][] visited;
    int[] dirX = {-1, 1, 0, 0};
    int[] dirY = {0, 0, -1, 1};
    int n;
    int m;
    
    public int solution(String[] storage, String[] requests) {
        int answer = 0;
        n = storage.length;
        m = storage[0].length();
        map = new String[n + 2][m + 2];
        
        for (int i = 0; i <= n + 1; i++) {
            Arrays.fill(map[i], "-1");
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                map[i][j] = String.valueOf(storage[i - 1].charAt(j - 1));
            }
        }
        for (int i = 0; i < requests.length; i++) {
            String target = requests[i];
            bfs();
            if (target.length() == 2) {
                crainRemove(target);
            } else {
                remove(target);
            }
        }
        
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (!map[i][j].equals("-1")) {
                    answer++;
                }
            }
        }
        return answer;
    }
    
    // 방문 가능한 곳 체크하기
    public void bfs() {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(new Node(0,0));
        visited = new boolean[n+2][m+2];
        visited[0][0] = true;
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = current.x + dirX[i];
                int newY = current.y + dirY[i];
                // 범위 밖임
                if (newX < 0 || newY < 0 || newX >= m + 2 || newY >= n + 2) {
                    continue;
                }
                // 이미 방문함
                if (visited[newY][newX] || !map[newY][newX].equals("-1")) {
                    continue;
                }
                visited[newY][newX] = true;
                queue.add(new Node(newX, newY));
            }
        }
    }
    
    // 걍 제거
    public void crainRemove(String target) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j].equals(String.valueOf(target.charAt(0)))) {
                    map[i][j] = "-1";
                }
            }
        }
    }
    
    // 접근 가능한애만 제거
    public void remove(String target) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j].equals(target)) {
                    if (isAvailable(i, j)) {
                        map[i][j] = "-1";
                    }
                }
            }
        }
    }
    
    // 얘 외곽임?
    public boolean isAvailable(int y, int x) {
        for (int i = 0; i < 4; i++) {
            int newX = x + dirX[i];
            int newY = y + dirY[i];
            if (visited[newY][newX]) {
                return true;
            }
        }
        return false;
    }
}
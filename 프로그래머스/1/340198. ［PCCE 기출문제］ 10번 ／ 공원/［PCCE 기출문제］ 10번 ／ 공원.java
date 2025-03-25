import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        
        for (int mat : mats) {
            for (int i = 0; i < park.length; i++) {
                for (int j = 0; j < park[i].length; j++) {
                    if (park[i][j].equals("-1") 
                        && isAvailable(mat, i, j, park)) {
                        answer = Math.max(answer, mat);
                    }
                }
            }
        }
        return answer;
    }
    // 현 위치부터 m만큼의 정사각형 너비로 깔 수 있음?
    // 현 위치에서 돗자리 펴면 밖으로 안삐져나감?
    public boolean isAvailable(int m, int y, int x, String[][] park) {
        if (m + y - 1 >= park.length || m + x -1>= park[0].length) {
            return false;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                String target = park[i + y][j + x];
                if (!target.equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}
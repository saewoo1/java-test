import java.util.*;

class Solution {
    public int solution(int[][] board) {
        Queue<int[]> minePos = new LinkedList<>();
        int answer = 0;
        int[][] dir = {{1,0}, {0,1}, {-1,0}, {0,-1}, {1,1}, {1,-1}, {-1,1}, {-1,-1}};
    
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    minePos.offer(new int[]{i, j});
                }
            }
        }
        while (!minePos.isEmpty()) {
            int[] pos = minePos.poll();
            for (int[] d : dir) {
                int newRow = pos[0] + d[0];
                int newCol = pos[1] + d[1];
                if ((newRow >= 0 && newRow < board.length) && (newCol >= 0 && newCol < board[0].length) && board[newRow][newCol] == 0) {
                    board[newRow][newCol] = 2;
                }
            }
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
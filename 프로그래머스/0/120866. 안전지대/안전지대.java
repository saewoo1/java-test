import java.util.*;

class Solution {
    
    public int[][] makeDangerMark(int row, int col, int[][] dir, int[][] board) {
        for (int[] d : dir) {
            int newRow = row + d[0];
            int newCol = col + d[1];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length && board[newRow][newCol] == 0) {
                board[newRow][newCol] = 3;
            }
        }
        return board;
    }
    
    public int solution(int[][] board) {
        int answer = 0;
        int[][] dir = {{1,0}, {0,1}, {-1,0}, {0,-1}, {1,1}, {1,-1}, {-1,1}, {-1,-1}};
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    board = makeDangerMark(i, j, dir, board);
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
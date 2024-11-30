import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        // 초기화
        scanner.nextLine();
        String[] board = new String[N];
        for (int i = 0; i < N; i++) {
            board[i] = scanner.nextLine();
        }
        
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int minCost = getSolution(i, j, board);
                
                answer = Math.min(minCost, answer);
            }
        }
        System.out.println(answer);
    }
    
    public static int getSolution(int startRow, int startCol, String[] board) {
        String[] originalBoard = {"WBWBWBWB", "BWBWBWBW"};
        
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int row = startRow + i;
            for (int j = 0; j < 8; j++) {
                int col = startCol + j;
                
                if (originalBoard[row % 2].charAt(j) != board[row].charAt(col)) {
                    count++;
                }
            }
        }
        return Math.min(count, 64 - count);
    }
}
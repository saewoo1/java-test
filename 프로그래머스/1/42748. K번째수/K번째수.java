import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int n = 0;
        for (int i = 0; i < answer.length; i++) {
            int[] list = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            
            Arrays.sort(list);
            answer[n++] = list[commands[i][2] - 1];
        }
        return answer;
    }
}
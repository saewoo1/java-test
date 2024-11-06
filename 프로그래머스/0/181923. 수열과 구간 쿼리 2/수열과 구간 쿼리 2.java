import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int index = 0;
        for (int[] scope : queries) {
            int start = scope[0];
            int end = scope[1];
            int limit = scope[2];
            
            int min = Integer.MAX_VALUE;
            for (int i = start; i <= end; i++) {
                if (arr[i] > limit && arr[i] < min) {
                    min = arr[i];
                }
            }
            if (min < Integer.MAX_VALUE) {
                answer[index++] = min;
            } else {
                answer[index++] = -1;
            }
        }
        return answer;
    }
}
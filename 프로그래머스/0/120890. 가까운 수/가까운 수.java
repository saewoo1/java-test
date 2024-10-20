import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = Math.abs(n - array[0]);
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            // 절대값 구하기
            int abs = Math.abs(n - array[i]);
            // 더 작은 절대값이 나온다면
            if (abs < answer) {
                // 절대값을 업데이트한다
                answer = abs;
                result = array[i];
            }
        }
        return result;
    }
}
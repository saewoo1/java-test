import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> set = new HashSet<>();
        int i = 0;
        for (int number : arr) {
            if (set.add(number)) {
                answer[i++] = number;
                if (i == k) {
                    break;
                }
            }
        }
        while (i < k) {
            answer[i++] = -1;
        }
        return answer;
    }
}
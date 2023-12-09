import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        int value = 10;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != value) {
                answer.add(arr[i]);
            }
            value = arr[i];
        }
        return answer.stream().mapToInt(o -> o).toArray();
    }
}
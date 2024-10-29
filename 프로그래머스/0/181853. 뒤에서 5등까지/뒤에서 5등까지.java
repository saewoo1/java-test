import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        answer = Arrays.copyOf(num_list, 5);
        return answer;
    }
}
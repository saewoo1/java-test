import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        if (counter.size() < answer) {
            answer = counter.size();
        }
        return answer;
    }
}
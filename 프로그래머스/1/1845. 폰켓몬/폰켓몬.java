import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int target = nums.length / 2;
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        if (counter.size() >= target) {
            return target;
        }
        if (counter.size() < target) {
            return counter.size();
        }
        return answer;
    }
}
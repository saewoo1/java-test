import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (set.size() < nums.length / 2) { // 서로 다른 마리수, 최대로 가질 수 있는 마리수(중복 포함) 비교
            return set.size();
        }
        return nums.length / 2;
    }
}
import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        if (m == 1) {
            return section.length;
        }
        Arrays.sort(section);
        int start = section[0];
        for (int i = 1; i < section.length; i++) {
            if (section[i] > start + m - 1) {
                start = section[i];
                answer++;
            }
        }
        return answer;
    }
}
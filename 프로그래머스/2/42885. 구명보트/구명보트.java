import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        // 최적 -> 가벼운 사람 + 무거운 사람
        // 가벼운 + 가벼운 이면 100일 때 30 30 밖에 못타면 손해
        Arrays.sort(people);
        int light = 0;
        int heavy = people.length - 1;
        while (light <= heavy) {
            if (people[light] + people[heavy] <= limit) {
                light++;
            }
            heavy--;
            answer++;
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int i =0;
        while (i < people.length) {
            if (i + 2 < people.length) {
                if (people[i] + people[i + 1] <= limit) {
                    answer++;
                    i += 2;
                }
                else {
                    answer++;
                    i++;
                }
            }
            else {
                answer++;
                i++;
            }
        }
        return answer;
    }
}
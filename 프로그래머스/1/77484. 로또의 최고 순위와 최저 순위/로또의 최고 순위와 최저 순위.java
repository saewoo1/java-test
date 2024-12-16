import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        int matchCount = 0;
        int zeroCount = 0;
        
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    matchCount++;
                    break;
                }
            }
        }
        answer[0] = calculateRank(matchCount + zeroCount);
        answer[1] = calculateRank(matchCount);
        return answer;
    }
    public int calculateRank(int matchCount) {
        if (matchCount == 6) {
            return 1;
        }
        if (matchCount == 5) {
            return 2;
        }
        if (matchCount == 4) {
            return 3;
        }
        if (matchCount == 3) {
            return 4;
        }
        if (matchCount == 2) {
            return 5;
        } 
        return 6;
    }
}
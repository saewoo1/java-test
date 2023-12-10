import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        /*
        총 학생 수 - 잃어버린 학생 수
        하지만 여분이 있는 학생 수가 존재하기 때문에 이를 계산해야한다.
        */
        int answer = n - lost.length;
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    reserve[j] = -1; // 못빌려줌. 내가써야됨
                    lost[i] = -1; // 빌릴 필요도 없음
                    break;
                }
            }
        }
        
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] - 1 == lost[i] || reserve[j] + 1 == lost[i]) {
                    answer++; // 빌려줌
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
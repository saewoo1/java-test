/*
토, 일 이벤트 제외
출근 희망시간 + 10분까지 출근해야함
시각 : 시 * 100 + 분
몇 명이나 선물을 받을까?
1~ 7 월 ~일
평일에 모두 성공한 사람의 수는?
*/

import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        // 총 인원
        for (int i = 0; i < timelogs.length; i++) {
            boolean success = true;
            int today = startday;
            
            for (int j = 0; j < timelogs[i].length; j++) {
                if (today != 6 && today != 7) {
                    // 목표시간
                    int limit = getLimit(schedules[i]);
                    // 지각했고, 평일이라면
                    if (limit < timelogs[i][j]) {
                    success = false;
                    }
                }
                today = (today % 7) + 1;
            }
            if (success) {
                answer++;
            }
        }
        return answer;
    }
    private int getLimit(int target) {
        target += 10;
        if (target % 100 >= 60 ) {
            int h = (target / 100) + 1;
            int m = (target % 100) - 60;
            target = (h * 100) + m;
        }
        return target;
    }
}
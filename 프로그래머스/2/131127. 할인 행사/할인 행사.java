import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        // 사려는 것들 map에 저장
        Map<String, Integer> basket = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            basket.put(want[i], number[i]);
        }
        int count = 0;
        // discount에서 10개씩 보면서 value 지우기?
        for (int i = 0; i < discount.length - 10; i++) {
            String
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> able = List.of("aya", "ye", "woo", "ma");
        for (String bable : babbling) {
            String result = bable.replaceAll("aya|ye|woo|ma", "");
            if (result.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Character> answer = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                answer.add((char)(my_string.charAt(i) - '0'));
            }
        }
        return answer.stream().sorted().mapToInt(e -> e).toArray();
    }
}
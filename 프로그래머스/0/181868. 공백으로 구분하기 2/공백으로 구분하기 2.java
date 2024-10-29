import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int size = st.countTokens();
        String[] answer = new String[size];
        for (int i = 0; i < size; i++) {
            answer[i] = st.nextToken();
        }
        return answer;
    }
}
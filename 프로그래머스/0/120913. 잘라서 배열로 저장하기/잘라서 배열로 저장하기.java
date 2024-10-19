class Solution {
    public String[] solution(String my_str, int n) {
        int len = 0;
        if (my_str.length() % n == 0) {
            len = my_str.length() / n;
        } else {
            len = my_str.length() / n + 1;
        }
        String[] answer = new String[len];
        int idx = 0;
        
        for (int i = 0; i < my_str.length(); i += n) {
            if (i + n >= my_str.length()) {
                answer[len - 1] = my_str.substring(i, my_str.length());
                return answer;
            }
            String element = my_str.substring(i, i + n);
            answer[idx] = element;
            idx++;
        }
        return answer;
    }
}
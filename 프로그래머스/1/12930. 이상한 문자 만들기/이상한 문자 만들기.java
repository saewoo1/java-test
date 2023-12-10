class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(""); // 문자 하나하나로
        
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(" ")) {
                index = 0;
                answer.append(" ");
            } else if (index % 2 == 0) {
                answer.append(words[i].toUpperCase());
                index++;
            } else {
                answer.append(words[i].toLowerCase());
                index++;
            }
        }
        return answer.toString();
    }
}
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] alphabet = s.split(""); // 문자 하나씩으로 인식
        int idx = 0; // 순서
        
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i].equals(" ")) {
                idx = 0; // 순서 초기화
                answer += " ";
            } else {
                if (idx % 2 == 0) {
                answer += alphabet[i].toUpperCase();
                idx++;
            } else {
                answer += alphabet[i].toLowerCase();
                idx++;
            }
            }
        }
        return answer;
    }
}
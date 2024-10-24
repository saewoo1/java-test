class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] sentence = quiz[i].split(" ");
            int sum = 0;
            int num1 = Integer.parseInt(sentence[0]);
            int num2 = Integer.parseInt(sentence[2]);
            int result = Integer.parseInt(sentence[4]);
            if (sentence[1].equals("+")) {
                sum = num1 + num2;
            }
            if (sentence[1].equals("-")) {
                sum = num1 - num2;
            }
            if (sum == result) {
                answer[i] = "O";
            }
            else {
                answer[i] = "X";
            }
            
        }
        return answer;
    }
}
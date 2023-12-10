class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            // 배열의 숫자들을 이진수로 변경
            // 비트연산으로 or 수행 -> 하나라도 1이면 1로 저장
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = answer[i].replaceAll("0", " ");
            answer[i] = answer[i].replaceAll("1", "#");
            
            // 이진법으로 표현한 수가 n보다 짧다면 모두 공백으로 채워준다
            while (answer[i].length() < n) {
                answer[i] = " " + answer[i];
            }
        }
        return answer;
    }
}
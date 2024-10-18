class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int multiple = numbers[i] * numbers[j];
                if (answer < multiple) {
                    answer = multiple;
                }
            }
        }
        return answer;
    }
}
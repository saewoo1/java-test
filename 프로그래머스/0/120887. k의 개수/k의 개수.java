class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int idx = i; idx <= j; idx++) {
            int number = idx;
            while (number != 0) {
                if (number % 10 == k) {
                    answer++;
                }
                number /= 10;
            }
        }
        return answer;
    }
}
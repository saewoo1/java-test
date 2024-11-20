class Solution {
    public long solution(int n) {
        long answer = 1;
        long f1 = 0;
        long f2 = 1;
        for (int i = 2; i <= n + 1; i++) {
            answer = (f1 + f2) % 1234567;
            f1 = f2;
            f2 = answer;
        }
        return answer;
    }
}
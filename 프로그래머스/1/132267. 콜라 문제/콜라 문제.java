class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int newBottles = (n / a) * b;
            answer += newBottles;
            n = newBottles + (n % a);
        }
        return answer;
    }
}
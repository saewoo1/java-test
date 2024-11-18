class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (isSum(i, n)) {
                answer++;
            }
        }
        return answer;
    }
    
    public boolean isSum(int i, int target) {
        int sum = 0;
        for (int j = i; j <= target; j++) {
            sum += j;
            if (sum == target) {
                return true;
            }
            if (sum > target) {
                return false;
            }
        }
        return false;
    }
}
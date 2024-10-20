class Solution {
    public int solution(int balls, int share) {
        if (balls == share || share == 0) {
            return 1;
        }
        return combination(balls, share);
    }
    public int combination(int n, int r) {
        long result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return (int) result;
    }
}
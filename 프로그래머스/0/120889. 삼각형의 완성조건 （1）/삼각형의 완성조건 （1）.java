class Solution {
    public int solution(int[] sides) {
        int maxLength = Integer.MIN_VALUE;
        int sum = 0;
        for (int side : sides) {
            sum += side;
            if (maxLength < side) {
                maxLength = side;
            }
        }
        sum -= maxLength;
        
        return sum > maxLength? 1 : 2;
    }
}
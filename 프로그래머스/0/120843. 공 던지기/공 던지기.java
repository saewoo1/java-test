class Solution {
    public int solution(int[] numbers, int k) {
        int i = 0;
        for (int count = 1; count < k; count++) {
            i = (i + 2) % numbers.length;
        }
        return numbers[i];
    }
}
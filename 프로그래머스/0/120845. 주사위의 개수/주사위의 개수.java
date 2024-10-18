class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for (int elem : box) {
            answer *= elem / n;
        }
        return answer;
    }
}
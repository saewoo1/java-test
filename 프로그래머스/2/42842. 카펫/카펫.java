class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        // 총 면적
        int area = brown + yellow;
        // 가로, 세로는 최소 3부터 시작한다(노랑을 포함해야함)
        int h = 3;
        int w = 3;
        while (true) {
            // 나누어 떨어지는가?
            if (area % h != 0) {
                h++;
                continue;
            }
            w = area / h;
            if ((h - 2) * (w - 2) == yellow) {
                return new int[]{w, h};
            }
            h++;
        }
    }
}
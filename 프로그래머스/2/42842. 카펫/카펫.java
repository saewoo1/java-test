class Solution {
    public int[] solution(int brown, int yellow) {
        int area = brown + yellow;
        for (int brownW = 3; brownW < brown; brownW++) {
            int brownH = area / brownW;
            
            if ((brownW - 2) * (brownH - 2) == yellow) {
                return new int[]{brownH, brownW};
            }
        }
        return new int[]{0,0};
    }
}
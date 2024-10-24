class Solution {
    public int solution(int[] common) {
        int length = common.length;
        if (common[length - 1] - common[length - 2] == common[1] - common[0]) {
            return common[length - 1] + (common[length - 1] - common[length - 2]);
        }
        return common[length - 1] * (common[length -1] / common[length - 2]);
    }
}
class Solution {
    public String solution(int n) {
        boolean even;
        even = n % 2 == 0;
        String watermelon = "수박";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            sb.append(watermelon);
        }
        if (!even) {
            sb.append("수");
        }
        return sb.toString();
    }
}
class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        while (coupon >= 10) {
            int newChicken = coupon / 10;
            answer += newChicken;
            coupon = coupon % 10 + newChicken;
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        return new int[] {gcd(n, m), n * m / gcd(n, m)};
    }
    
    public int gcd(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
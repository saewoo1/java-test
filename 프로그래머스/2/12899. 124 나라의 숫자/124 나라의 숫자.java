class Solution {
    public String solution(int n) {
        String numbers = "124";
        StringBuilder sb = new StringBuilder();
        int len = numbers.length();
        
        while (n > 0) {
            n--;
            int remain = n % len;
            sb.insert(0, numbers.charAt(remain));
            n /= len;
        }
        return sb.toString();
    }
}
class Solution {
    public int solution(int n) {
        String current = Integer.toBinaryString(n);
        int currentOne = countOne(current);
        
        while (true) {
            n++;
            String next = Integer.toBinaryString(n);
            int nextOne = countOne(next);
            if (nextOne == currentOne) {
                return n;
            }
        }
    }
    
    public int countOne(String binary) {
        int count = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}
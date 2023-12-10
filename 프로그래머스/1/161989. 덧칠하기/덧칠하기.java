class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        answer++;
        
        for (int area : section) {
            if (start + m > area) {
                continue;
            }
            
            start = area;
            answer++;
        }
        
        return answer;
    }
}
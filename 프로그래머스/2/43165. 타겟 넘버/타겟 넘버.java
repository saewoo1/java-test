class Solution {
    int[] numbers;
    int answer;
    int target;
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        answer = 0;
        dfs(0, 0);
        return answer;
    }
    
    public void dfs(int i, int currentSum) {
        if (i == numbers.length) {
            if (currentSum == target) {
                answer++;
            }
            return;
        }
        dfs(i + 1, currentSum + numbers[i]);
        dfs(i + 1, currentSum - numbers[i]);
    }
}
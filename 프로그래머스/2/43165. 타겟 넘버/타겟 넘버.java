class Solution {
    public int solution(int[] numbers, int target) {
        
        return dfs(numbers, 0, 0, target);
    }
    
    public int dfs(int[] numbers, int i, int sum, int target) {
        if (i == numbers.length) {
            if (sum == target) {
                return 1;
            }
            else {
                return 0;
            }
        }
        
        return dfs(numbers, i + 1, numbers[i] + sum, target) 
            + dfs(numbers, i + 1, sum - numbers[i], target);
    }
}
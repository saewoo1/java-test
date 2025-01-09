import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = -1;
        Queue<int[]> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(new int[]{x, 0});
        visited.add(x);
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            
            if (current[0] == y) {
                return current[1];
            }
            int[] nextNumbers = {current[0] + n, current[0] * 2, current[0] * 3};
            for (int number : nextNumbers) {
                if (y < number || visited.contains(number)) {
                    continue;
                }
                queue.offer(new int[]{number, current[1] + 1});
                visited.add(number);
            }
        }
        return -1;
    }
}
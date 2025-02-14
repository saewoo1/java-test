import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0, y = 0;
        
        Set<String> visited = new HashSet<>();
        for (char c : dirs.toCharArray()) {
            int newX = x;
            int newY = y;
            
            if (c == 'U' && isInRange(x, y + 1)) {
                y += 1;
            }
            if (c == 'D' && isInRange(x, y - 1)) {
                y -= 1;
            }
            if (c == 'L' && isInRange(x - 1, y)) {
                x -= 1;
            }
            if (c == 'R' && isInRange(x + 1, y)) {
                x += 1;
            }
            if (newX == x && newY == y) {
                continue;
            }
            
            String path1 = x + "," + y + "-" + newX + "," + newY;
            String path2 = newX + "," + newY + "-" + x + "," + y;
            
            if (!visited.contains(path1) && !visited.contains(path2)) {
                visited.add(path1);
                visited.add(path2);
                answer++;
            }
            newX = x;
            newY = y;
        }
        return answer;
    }
    
    public boolean isInRange(int x, int y) {
        if (x > 5 || x < -5) {
            return false;
        }
        if (y > 5 || y < -5) {
            return false;
        }
        return true;
    }
}
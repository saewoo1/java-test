import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0, y = 0;
        Set<String> visited = new HashSet<>();
        
        for (char dir : dirs.toCharArray()) {
            int newX = x;
            int newY = y;
            if (dir == 'U' && isInRange(x, y + 1)) {
                newY += 1;
            }
            if (dir == 'D' && isInRange(x, y - 1)) {
                newY -= 1;
            }
            if (dir == 'L' && isInRange(x - 1, y)) {
                newX -= 1;
            }
            if (dir == 'R' && isInRange(x + 1, y)) {
                newX += 1;
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
            x = newX;
            y = newY;
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
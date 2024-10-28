import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        HashSet<Integer> overWrapped = new HashSet<>();
        for (int i = 0; i < lines.length; i++) {
            for (int j = i + 1; j < lines.length; j++) {
                int start = Math.max(lines[i][0], lines[j][0]);
                int end = Math.min(lines[i][1], lines[j][1]);
                
                if (start < end) {
                    for (int k = start; k < end; k++) {
                        overWrapped.add(k);
                    }
                }
            }
        }
        return overWrapped.size();
    }
}
import java.util.*;

class Solution {
    public int[] solution(String s) {
        int removed = 0;
        int transCount = 0;
        
        while (!s.equals("1")) {
            int oneCount = 0;
            
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    oneCount++;
                }
                else {
                    removed++;
                }
            }
            s = Integer.toBinaryString(oneCount);
            transCount++;
        }
        return new int[]{transCount, removed};
    }
}
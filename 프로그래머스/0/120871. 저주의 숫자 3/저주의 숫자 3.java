import java.util.*;

class Solution {
    public int solution(int n) {
        int i = 0;
        while (n > 0) {
            i++;
            if (i % 3 == 0 || (i + "").contains("3")) {
                continue;
            }
            n--;
        }
        return i;
    }
}
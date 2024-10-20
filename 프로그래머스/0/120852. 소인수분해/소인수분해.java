import java.util.*;

class Solution {
    public int[] solution(int n) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int i = 2;
        while (n != 0 && i <= n) {
            if (n % i == 0) {
                set.add(i);
                n /= i;
            }
            else {
                i++;
            }
        }
        return set.stream().mapToInt(e -> e).toArray();
    }
}
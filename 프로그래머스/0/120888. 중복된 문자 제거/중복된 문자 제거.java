import java.util.*;

class Solution {
    public String solution(String my_string) {
        HashSet<Character> set = new LinkedHashSet<>();
        for (char c : my_string.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }
        return new String(sb);
    }
}
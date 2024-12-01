import java.util.*;
class Solution {
    
    static List<String> words = new ArrayList<>();
    
    public int solution(String word) {
        dfs("");
        
        return words.indexOf(word);
    }
    public static void dfs(String current) {
        if (current.length() > 5) {
            return;
        }
        
        words.add(current);
        for (int i = 0; i < 5; i++) {
            dfs(current + "AEIOU".charAt(i));
        }
    }
}
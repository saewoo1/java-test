import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        for (int i = 0; i < dic.length; i++) {
            int answer = 1;
            for (int j = 0; j < spell.length; j++) {
                String elem = dic[i];
                if (!elem.contains(spell[j])) {
                    answer = 2;
                    break;
                }
            }
            if (answer == 1) {
                return 1;
            }
        }
        return 2;
    }
}
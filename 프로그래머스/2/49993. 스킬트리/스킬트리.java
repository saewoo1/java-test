import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String tree : skill_trees) {
            int order = 0;
            boolean valid = true;
            
            for (int i = 0; i < tree.length(); i++) {
                char currentSkill = tree.charAt(i);
                int skillIdx = skill.indexOf(currentSkill);
                
                if (skillIdx == -1) {
                    continue;
                }
                if (skillIdx == order) {
                    order++;
                }
                else {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                answer++;
            }
            
        }
        return answer;
    }
}
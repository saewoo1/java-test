import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        List<String> answer = new ArrayList<>();
        Map<String, String> userInfo = new HashMap<>();
        
        for (int i = 0; i < record.length; i++) {
            String[] words = record[i].split(" ");
            String command = words[0];
            String id = words[1];
            if (command.equals("Enter") || command.equals("Change")) {
                String nickName = words[2];
                userInfo.put(id, nickName);
            }
            
        }
        
        for (int i = 0; i < record.length; i++) {
            String[] words = record[i].split(" ");
            String command = words[0];
            String id = words[1];
            
            if (command.equals("Enter")) {
                String nickName = userInfo.get(id);
                answer.add(generateEnterMessage(nickName));
            }
            if (command.equals("Leave")) {
                String nickName = userInfo.get(id);
                answer.add(generateLeaveMessage(nickName));
            }
        }
        return answer.toArray(new String[0]);
    }
    
    public String generateEnterMessage(String nickName) {
        return nickName + "님이 들어왔습니다.";
    }
    
    public String generateLeaveMessage(String nickName) {
        return nickName + "님이 나갔습니다.";
    }
}
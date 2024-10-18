import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        StringBuilder answer = new StringBuilder();
        for (String[] info : db) {
            String id = info[0];
            String pw = info[1];
            if (id_pw[0].equals(id)) {
                if (id_pw[1].equals(pw)) {
                    return "login";
                }
                answer.append("wrong pw");
            }
        }
        if (answer.toString().contains("wrong pw")) {
            return "wrong pw";
        } else {
            return "fail";
        }
    }
}
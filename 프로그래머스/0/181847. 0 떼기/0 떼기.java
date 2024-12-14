import java.util.*;

/*
가장 왼쪽에 0이면 떼주세여
*/
class Solution {
    public String solution(String n_str) {
        StringBuilder answer = new StringBuilder();
        int i = 0;
        while (n_str.charAt(i) == '0') {
            i++;
        }
        return n_str.substring(i);
    }
}
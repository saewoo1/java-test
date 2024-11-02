import java.util.*;

class Solution {
    public String solution(int[] food) {
        
        StringBuilder sb = new StringBuilder();
        int length = food.length;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(i + "");
            }
        }
        String reverse = sb.reverse().toString();
        sb.reverse().append("0");
        return sb.toString() + reverse;
    }
}
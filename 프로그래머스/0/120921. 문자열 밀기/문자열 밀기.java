import java.util.*;

class Solution {
    
    public String pushChar(String A) {
        char[] charArray = A.toCharArray();
        char end = charArray[charArray.length - 1];

        for (int i = charArray.length - 1; i > 0; i--) {
            charArray[i] = charArray[i - 1];
        }
        charArray[0] = end;
        return new String(charArray);
    }
    
    public int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        }
        for (int i = 1; i <= A.length(); i++) {
            A = pushChar(A);
            if (A.equals(B)) {
                return i;
            }
        }
        return -1;
    }
}
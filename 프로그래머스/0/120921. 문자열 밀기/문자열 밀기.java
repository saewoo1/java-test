import java.util.*;

class Solution {
    public char[] pushRight(char[] array) {
        char end = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = end;
        return array;
    }
    public int solution(String A, String B) {
        int answer = 0;
        if (A.equals(B)) {
            return 0;
        }
        char[] arrayA = A.toCharArray();
        char[] arrayB = B.toCharArray();
        for (int i = 1; i <= arrayA.length; i++) {
            arrayA = pushRight(arrayA);
            answer++;
            if (Arrays.equals(arrayA, arrayB)) {
                return answer;
            }
        }
        return -1;
    }
}
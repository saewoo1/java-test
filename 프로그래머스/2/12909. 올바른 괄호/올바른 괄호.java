
class Solution {
    boolean solution(String s) {
        boolean result = true;
        int even = 0;
        if (s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                even++;
            } else {
                even--;
            }
            if (even < 0) {
                return false;
            }
        }
        if (even != 0) {
            return false;
        }
		return result;
    }
}
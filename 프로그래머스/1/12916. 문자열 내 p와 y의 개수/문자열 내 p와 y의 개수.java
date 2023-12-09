class Solution {
    boolean solution(String s) {
        String lowerCase = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < lowerCase.length(); i++) {
            if (lowerCase.charAt(i) == 'p') {
                pCount++;
            } else if (lowerCase.charAt(i) == 'y') {
                yCount++;
            }
        }
        return pCount == yCount;
    }
}
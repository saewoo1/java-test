class Solution {
    public String solution(String my_string) {
        String answer = "";
        return my_string.replaceAll("a|e|i|o|u", "");
    }
}
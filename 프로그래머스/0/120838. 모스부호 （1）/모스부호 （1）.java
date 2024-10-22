import java.util.*;

class Solution {
    public String solution(String letter) {
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String[] morseArr = {
            ".- a", "-... b", "-.-. c", "-.. d", ". e", "..-. f",
            "--. g", ".... h", ".. i", ".--- j", "-.- k", ".-.. l",
            "-- m", "-. n", "--- o", ".--. p", "--.- q", ".-. r",
            "... s", "- t", "..- u", "...- v", ".-- w", "-..- x",
            "-.-- y", "--.. z"
        };
        for (String morse : morseArr) {
            String[] pair = morse.split(" ");
            map.put(pair[0], pair[1]);
        }
        String[] letters = letter.split(" ");
        for (String let : letters) {
            sb.append(map.getOrDefault(let, ""));
        }
        return sb.toString();
    }
}
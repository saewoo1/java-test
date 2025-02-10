import java.util.*;

/*
terms -> 약관 / 유효기한
privacies -> 수집 날짜 / 약관 종류
*/
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Long> kindAndTerm = new HashMap<>();
        long convertedToday = convertToDays(today);
        
        for (String term : terms) {
            String[] split = term.split(" ");
            kindAndTerm.put(split[0], Long.parseLong(split[1]) * 28);
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String[] elem = privacies[i].split(" "); // 수집일자, 약관 종류
            long stored = kindAndTerm.get(elem[1]); // 보관 기한
            long limited = convertToDays(elem[0]) + stored;
            
            if (convertedToday >= limited) {
                answer.add(i + 1);
            }
        }
        
        
        return answer.stream().mapToInt(e -> e).toArray();
    }
    
    public long convertToDays(String date) {
        long result = 0;
        
        String[] split = date.split("\\.");
        long years = Long.parseLong(split[0]);
        long month = Long.parseLong(split[1]);
        long day = Long.parseLong(split[2]);
        
        return years * 12 * 28 + month * 28 + day;
    }
}
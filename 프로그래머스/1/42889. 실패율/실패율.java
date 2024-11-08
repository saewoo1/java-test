import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int total = stages.length;
        int[] answer = new int[N + 1];
        Map<Integer, Double> fail = new HashMap<>();
        // 스테이지별 인원
        for (int stage : stages) {
            if (stage <= N) answer[stage]++;
        }
        
        int prevPerson = 0;
        for (int i = 1; i <= N; i++) {
            // 해당 층에 머무르는중인 사람 수
            int stagePerson = answer[i];
            if (total - prevPerson > 0) {
                fail.put(i, ((double)stagePerson / (total - prevPerson)));
            }
            else {
                fail.put(i, 0.0);
            }
            prevPerson += stagePerson;
        }
        
        return fail.entrySet().stream()
            .sorted((a, b) -> {
                int cmp = Double.compare(b.getValue(), a.getValue());
                if (cmp == 0) {
                    return Integer.compare(a.getKey(), b.getKey());
                }
                return cmp;
                })
            .mapToInt(Map.Entry::getKey)
            .toArray();
    }
}
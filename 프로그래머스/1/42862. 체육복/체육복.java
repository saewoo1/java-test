import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> losts = Arrays.stream(lost)
            .filter(l -> Arrays.stream(reserve).noneMatch(r -> r == l))
            .boxed()
            .collect(Collectors.toList());
        List<Integer> reserves = Arrays.stream(reserve)
            .filter(r -> Arrays.stream(lost).noneMatch(l -> l == r))
            .boxed()
            .collect(Collectors.toList());
        Collections.sort(losts);
        Collections.sort(reserves);
        
        int answer = n - losts.size();
        for (int reserver : reserves) {
            if (losts.contains(reserver - 1)) {
                answer++;
                losts.remove(Integer.valueOf(reserver - 1));
            }
            else if (losts.contains(reserver + 1)) {
                answer++;
                losts.remove(Integer.valueOf(reserver + 1));
            }
        }
        
        return answer;
    }
}
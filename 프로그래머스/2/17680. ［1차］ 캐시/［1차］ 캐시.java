import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int hit = 1;
        int miss = 5;
        if (cacheSize == 0) {
            return cities.length * miss;
        }
        
        LinkedList<String> cache = new LinkedList<>();
        for (String city : cities) {
            city = city.toLowerCase();
            if (cache.contains(city)) {
                answer += hit;
                cache.remove(city);
                cache.addLast(city);
            }
            else {
                if (cache.size() >= cacheSize) {
                    cache.removeFirst();
                }
                cache.addLast(city);
                answer += miss;
            }
        }
        return answer;
    }
}
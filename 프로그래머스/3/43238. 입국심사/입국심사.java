import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long start = 1;
        long end = (long) times[times.length - 1] * n;
        
        while (start < end) {
            long minute = (start + end) / 2;
            
            if (isValid(times, minute, n)) {
                end = minute;
            } else {
                start = minute + 1;
            }
        }
        return start;
    }
    
    public boolean isValid(int[] times, long min, int n) {
        long count = 0;
        for (int time : times) {
            count += min / time;
            if (count >= n) {
                return true;
            }
        }
        return false;
    }
}
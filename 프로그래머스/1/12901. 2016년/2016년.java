import java.util.*;
import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int year = 2016;
        LocalDate date = LocalDate.of(year, a, b);
        
        return date.getDayOfWeek().toString().substring(0, 3);
    }
}
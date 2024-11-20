import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] weapons = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                weapons[j]++;
            }
        }
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] > limit) {
                weapons[i] = power;
            }
        }
        
        return Arrays.stream(weapons).sum();
    }
}
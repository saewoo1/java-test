import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int time = bandage[0]; // 시전 시간
        int heal = bandage[1]; // 회복량
        int add = bandage[2]; // 추가 회복량
        int currentHeart = health;
        int n = attacks.length;
        int lastTime = attacks[n - 1][0];
        int stack = 0;
        Map<Integer, Integer> monster = new HashMap<>();
        // 
        for (int[] attack : attacks) {
            monster.put(attack[0], attack[1]);
        }
        
        for (int i = 0; i <= lastTime; i++) {
            // 맞을 시간됐다
           if (monster.containsKey(i)) {
               currentHeart -= monster.get(i);
               stack = 0;
               if (currentHeart <= 0) {
                   return -1;
               }
           } else {
               
               currentHeart += heal;
               stack++;
               currentHeart = Math.min(currentHeart, health);
               if (stack == time) {
                   currentHeart += add;
                   stack = 0;
                   currentHeart = Math.min(currentHeart, health);
               }
           }
        }
        return currentHeart;
    }
}
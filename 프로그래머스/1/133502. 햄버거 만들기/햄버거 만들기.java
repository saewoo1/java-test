import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> burger = new ArrayList<>(List.of(1,2,3,1));
        List<Integer> ingredients = new ArrayList<>();
        
        for (int elem : ingredient) {
            ingredients.add(elem);
            if (ingredients.size() >= 4 &&
               ingredients.subList(ingredients.size() - 4, ingredients.size()).equals(burger)) {
                for (int i = 0; i < 4; i++) {
                    ingredients.remove(ingredients.size() - 1);
                }
                answer++;
            }
            
        }
        return answer;
    }
}
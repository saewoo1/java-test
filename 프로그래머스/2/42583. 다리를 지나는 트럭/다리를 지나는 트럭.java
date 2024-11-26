import java.util.*;

class Solution {
    
    public class Truck {
        int weight;
        int position;
        
        public Truck(int weight, int position) {
            this.weight = weight;
            this.position = position;
        }
    }
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        // 다리 위 총 무게
        int bridgeWeight = 0;
        Queue<Truck> bridge = new LinkedList<>();
        int idx = 0;
        
        // 대기 트럭이 있거나, 다리 위에 트럭이 있음
        while (idx < truck_weights.length || !bridge.isEmpty()) {
            answer++;
            
            if (!bridge.isEmpty()) {
                Truck prev = bridge.peek();
                // 트럭 치워
                if (answer - prev.position >= bridge_length) {
                    bridgeWeight -= prev.weight;
                    bridge.poll();
                }
            }
            
            if (idx < truck_weights.length) {
                if (bridgeWeight + truck_weights[idx] <= weight && bridge.size() < bridge_length) {
                    bridge.add(new Truck(truck_weights[idx], answer));
                    bridgeWeight += truck_weights[idx];
                    idx++;
                }
            }
        }
        return answer;
    }
}
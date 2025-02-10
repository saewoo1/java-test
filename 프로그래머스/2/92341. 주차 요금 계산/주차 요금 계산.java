import java.util.*;

/*
fees -> len = 4, 기본 시간 / 기본 요금 / 단위 시간 / 단위 요금
records -> 시각 / 차량 번호 / 내역

출차 내역이 없을 경우, 23:59에 출차한 것으로 간주한다.
차량 번호가 작은 자동차부터 청구할 주차 요금을 차례대로 정수 배열에 담아 반환하라.
*/

class Solution {
    public int[] solution(int[] fees, String[] records) {
        List<Integer> answer = new ArrayList<>();
        int baseTime = fees[0];
        int baseFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        // 번호와 누적 시간
        Map<Integer, Integer> park = new TreeMap<>();
        // 입차 시 임시로 담기
        Map<Integer, Integer> tmp = new TreeMap<>();
        
        for (int i = 0; i < records.length; i++) {
            String[] record = records[i].split(" ");
            int time = convertToMin(record[0]);
            int carNumber = Integer.parseInt(record[1]);
            
            if (record[2].equals("IN")) {
                tmp.put(carNumber, time);
            } else {
                int enterTime = tmp.get(carNumber);
                park.put(carNumber, park.getOrDefault(carNumber, 0) + (time - enterTime));
                
                if (tmp.containsKey(carNumber)) {
                    tmp.remove(carNumber);
                }
            }
        }
        // IN만 있고, OUT이 없는 케이스 처리
        for (Integer carNumber : tmp.keySet()) {
            int inTime = tmp.get(carNumber);
            int useTime = convertToMin("23:59") - inTime;
            
            park.put(carNumber, park.getOrDefault(carNumber, 0) + (useTime));
        }
        
        for (Integer usingTime : park.values()) {
            int totalFee = 0;
            
            // 기본요금 계산
            usingTime -= baseTime;
            totalFee += baseFee;
            
            // 추가요금 계산
            if (usingTime > 0) {
                totalFee += Math.ceil((double)usingTime / unitTime) * unitFee;
            }
            answer.add(totalFee);
        }
        
        
        
        return answer.stream().mapToInt(e -> e).toArray();
    }
    
    public int convertToMin(String times) {
        String[] time = times.split(":");
        return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
    }
}
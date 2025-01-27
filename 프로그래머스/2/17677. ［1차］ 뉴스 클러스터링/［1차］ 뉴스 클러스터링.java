/*
자카드 유사도 : 두 집합의 교 집합 크기 / 두 집합의 합집합 크기
둘 다 공집합일 경우, 1로 정의한다.

중복 허용하는 다중집합에도 적용한다.
111 / 11111 -> AnB : 3, AuB -> 5
두 글자씩 끊어 다중집합의 원소로 만든다.
(영문자로 된 글자쌍만 유효, 불순물 포함 시 그 글자 쌍을 버린다.)
대소문자 차이는 무시한다.
교집합은 min으로, 합집합은 max로?
*/

import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        Map<String, Integer> str1Counter = generateMultiSet(str1);
        Map<String, Integer> str2Counter = generateMultiSet(str2);
        int intersectionCount = 0;
        int unionCount = 0;
        
        // 모든 키를 더해서 합집합 만들기
        Set<String> allKeys = new HashSet<>(str1Counter.keySet());
        allKeys.addAll(str2Counter.keySet());
        
        for (String key : allKeys) {
            int count1 = str1Counter.getOrDefault(key, 0);
            int count2 = str2Counter.getOrDefault(key, 0);
            
            intersectionCount += Math.min(count1, count2);
            unionCount += Math.max(count1, count2);
        }
        if (intersectionCount == 0 && unionCount == 0) {
            intersectionCount = 1;
            unionCount = 1;
        }
        double similarity = (double) intersectionCount / unionCount;
        
        return (int) (similarity * 65536);
    }
    public Map<String, Integer> generateMultiSet(String str) {
        Map<String, Integer> counter = new HashMap<>();
        
        for (int i = 0; i < str.length() - 1; i++) {
            String pair = str.substring(i, i + 2);
            
            if (isValidString(pair)) {
                counter.put(pair, counter.getOrDefault(pair, 0) + 1);
            }
        }
        return counter;
    }
    
    public boolean isValidString(String str) {
        return str.matches("^[A-Z]+$");
    }
}
import java.util.*;

// , 기준으로 자르고 길이로 보면 안되나
class Solution {
    public int[] solution(String s) {
        String[] splitted = s.replaceAll("\\{", " ").replaceAll("\\}", " ")
            .trim()
            .split(" , ");
        
        Arrays.sort(splitted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        
        List<Integer> tuple = new ArrayList<>();
        for (String str : splitted) {
            String[] sliced = str.split(",");
            for (String number : sliced) {
                int elem = Integer.parseInt(number);
                if (!tuple.contains(elem)) {
                    tuple.add(elem);
                }
            }
        }
        return tuple.stream().mapToInt(e -> e).toArray();
    }
}
class Solution {
    private static final Integer CLEANING_TIME = 10;
    private static final Integer MAX = (24 * 60) + 10;
    private static final Integer MINUTE = 60;
    
    public int solution(String[][] book_time) {
        int answer = 0;
        int[] rooms = new int[MAX];
        int result = 0;
        for (String[] string : book_time) {
            String startTime = string[0];
            String endTime = string[1];
            
            rooms[convertToTime(startTime)] += 1;
            rooms[convertToTime(endTime) + 10] -= 1;
        }
        for (int room : rooms) {
            result += room;
            answer = Math.max(answer, result);
        }
        return answer;
    }
    private static int convertToTime(String time) {
        String[] convert = time.split(":");
        
        return Integer.parseInt(convert[0]) * MINUTE + Integer.parseInt(convert[1]);
    }
    
}
import java.util.*;

class Solution {
    public int convertToSec(String s) {
        String[] split = s.split(":");
        int min = Integer.parseInt(split[0]);
        int sec = Integer.parseInt(split[1]);
        
        return min * 60 + sec;
    }
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoSec = convertToSec(video_len);
        int posSec = convertToSec(pos);
        int opStartSec = convertToSec(op_start);
        int opEndSec = convertToSec(op_end);
        
        if (posSec >= opStartSec && posSec <= opEndSec) {
            posSec = opEndSec;
        }
        for (String c : commands) {
            if (c.equals("prev")) {
                posSec = Math.max(posSec - 10, 0);
            } else {
                posSec = Math.min(posSec + 10, videoSec);
            }
            if (posSec >= opStartSec && posSec <= opEndSec) {
                posSec = opEndSec;
            }
        }
        int resMin = posSec / 60;
        int resSec = posSec % 60;
        return String.format("%02d:%02d", resMin, resSec);
    }
}
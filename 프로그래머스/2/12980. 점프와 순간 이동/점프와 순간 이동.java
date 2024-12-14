import java.util.*;

/*
1. K 칸 만큼 점프 -> K만큼 건전지
2. 온 거리 * 2 순간이동 -> 비용 안들음
N까지 이동하려할 때, 최소 사용 건전지값은?
*/
public class Solution {
    public int solution(int n) {
        int ans = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                ans++;
                n--;
            }
            n /= 2;
        }

        return ans;
    }
}
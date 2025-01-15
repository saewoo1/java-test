import java.util.*;
// 연속된 수열 중, 합이 target 이상이 되는 가장 짧은 길이 반환하기.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int left = 0, sum = 0, len = Integer.MAX_VALUE;
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            
            while (sum >= target) {
                len = Math.min(len, (right - left + 1));
                sum -= arr[left++];
            }
        }
        if (len == Integer.MAX_VALUE) {
            len = 0;
        }
        System.out.println(len);
    }
}
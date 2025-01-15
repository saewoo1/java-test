import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] nums = new int[count];
        
        for (int i = 0; i < count; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        int target = 0, left = 0, right = count - 1;
        int mix = Integer.MAX_VALUE;
        int[] result = new int[2];
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (Math.abs(sum) < mix) {
                mix = Math.abs(sum);
                result[0] = nums[left];
                result[1] = nums[right];
            }
            if (sum < 0) {
                left++;
            } else {
                right--;
            }
            
        }
        System.out.println(result[0] + " " + result[1]);
        
    }
}
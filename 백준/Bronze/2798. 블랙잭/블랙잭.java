import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
		int target = scanner.nextInt();

		int tmp = 0;
		int[] numbers = new int[count];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				for (int k = j + 1; k < count; k++) {
					int sum = numbers[i] + numbers[j] + numbers[k];
					if (tmp < sum && sum <= target) {
						tmp = sum;
					}
				}
			}
		}
		System.out.println(tmp);
    }
}
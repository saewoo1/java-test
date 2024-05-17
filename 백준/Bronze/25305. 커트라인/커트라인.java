

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int all = scanner.nextInt();
		int count = scanner.nextInt();

		int[] numbers = new int[all];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		int tmp = 0;
		for (int i = 0; i < all - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < all; j++) {
				if (numbers[j] < numbers[minIdx]) {
					minIdx = j;
				}
			}
			tmp = numbers[i];
			numbers[i] = numbers[minIdx];
			numbers[minIdx] = tmp;
		}
		System.out.println(numbers[all - count]);
	}
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] score;
    int count = scanner.nextInt();

    for (int i = 0; i < count; i++) {
      int number = scanner.nextInt();
      score = new int[number];
      double sum = 0;
      for (int j = 0; j < number; j++) {
        int grade = scanner.nextInt();
        score[j] = grade;
        sum += grade;
      }
      double average = sum / number;
      double over = 0;
      for (int k = 0; k < number; k++) {
        if (score[k] > average) {
          over++;
        }
      }
      System.out.printf("%.3f", over / number * 100);
      System.out.println("%");
    }
  }
}

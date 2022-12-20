import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int count = scanner.nextInt();
    float[] score = new float[count];
    float max = 0;
    float sum = 0;

    for (int i = 0; i < score.length; i++) {
      score[i] = scanner.nextInt();
      max = Math.max(max, score[i]);
    }
    for (int i = 0; i < score.length; i++) {
      sum += score[i] / max * 100;
    }
    System.out.println(sum / count);
  }
}
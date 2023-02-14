import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    SelectSort selectSort = new SelectSort();
    int[] ints = new int[5];
    int sum = 0;

    for (int i = 0; i < ints.length; i++)
      ints[i] = scanner.nextInt();
    selectSort.sort_function(ints);
    for (int i = 0; i < ints.length; i++) {
      sum+= ints[i];
    }

    System.out.println(sum / 5);
    System.out.println(ints[2]);
  }
}

class SelectSort {
  int[] sort_function(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min_idx = i;
      int tmp = arr[i];
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[min_idx] > arr[j])
          min_idx = j;
      }
      arr[i] = arr[min_idx];
      arr[min_idx] = tmp;
    }
    return (arr);
  }
}

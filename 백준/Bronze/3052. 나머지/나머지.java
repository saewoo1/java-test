

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[10];
    int count = 0;

    for (int i = 0; i < 10; i++) {
      int num = Integer.parseInt(bufferedReader.readLine());
      arr[i] = num % 42;
    }

    int flag;
    for (int i = 0; i < arr.length; i++) {
      flag = 0;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          flag = 1; // 뒤에서라도 같은걸 찾았다
          break;
        }
      }
      if (flag == 0) {
        count++;
      }
    }
    System.out.println(count);

  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(bufferedReader.readLine());
    StringBuilder stringBuilder = new StringBuilder();
    int[][] arr = new int[15][15];

    for (int i = 1; i <= 14; i++) {
      arr[0][i] = i;
    }
    for (int i = 1; i<= 14; i++) {
      for (int j = 1; j <= 14; j++) {
        arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
      }
    }

    for (int i = 0; i < count; i++) {
      int k = Integer.parseInt(bufferedReader.readLine());
      int n = Integer.parseInt(bufferedReader.readLine());
      stringBuilder.append(arr[k][n] + "\n");
    }
    System.out.println(stringBuilder);
  }
}

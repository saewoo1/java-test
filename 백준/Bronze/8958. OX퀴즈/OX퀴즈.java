import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder stringBuilder = new StringBuilder();

    int count = Integer.parseInt(bufferedReader.readLine());
    String[] arr = new String[count];

    for (int i = 0; i < count; i++) {
      arr[i] = bufferedReader.readLine();
    }

    for (int i = 0; i < count; i++) {
      int circle = 0;
      int sum = 0;
      for (int j = 0; j < arr[i].length(); j++) {
        if (arr[i].charAt(j) == 'O') {
          circle++;
        } else {
          circle = 0;
        }
        sum += circle;
      }
      stringBuilder.append(sum).append('\n');
    }
    System.out.println(stringBuilder);
  }
}

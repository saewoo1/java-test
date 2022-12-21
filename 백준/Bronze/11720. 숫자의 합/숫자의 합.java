import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(bufferedReader.readLine());
    String number = bufferedReader.readLine();
    int res = 0;
    for (int i = 0; i < count; i++) {
      res += number.charAt(i) - '0';
    }
    System.out.println(res);
  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int origin = Integer.parseInt(bufferedReader.readLine());
    int copy = origin;
    int count = 0;

    do {
      origin = ((origin % 10) * 10) + (((origin / 10) + (origin % 10)) % 10);
      count++;
    } while (copy != origin);
    System.out.println(count);
  }
}
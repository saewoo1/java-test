import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String[] ABV = bufferedReader.readLine().split(" ");
    int A = Integer.parseInt(ABV[0]);
    int B = Integer.parseInt(ABV[1]);
    int V = Integer.parseInt(ABV[2]);
    int day = (V - B) / (A - B);

    if ((V - B) % (A - B) != 0) {
      day += 1;
      System.out.println(day);
    } else {
      System.out.println(day);
    }
  }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder stringBuilder = new StringBuilder();
    int count = Integer.parseInt(bufferedReader.readLine());

    for (int i = 0; i < count; i++){
      String line = bufferedReader.readLine();
      int divider = line.indexOf(" ");
      int res = Integer.parseInt(line.substring(0, divider)) + Integer.parseInt(line.substring(divider + 1));
      System.out.println("Case #" + (i + 1) + ": " + line.substring(0, divider) + " + " + line.substring(divider + 1) + " = " + res);
    }
  }
}
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(bufferedReader.readLine());
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < num; i++) {
      String str = bufferedReader.readLine();
      int test = str.indexOf(" ");
      int res = Integer.parseInt(str.substring(0, test)) + Integer.parseInt(str.substring(test + 1));
      stringBuilder.append(res + "\n");
    }

    bufferedReader.close();
    System.out.println(stringBuilder);
  }
}
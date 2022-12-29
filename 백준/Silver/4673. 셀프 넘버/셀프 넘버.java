public class Main {
  public static void main(String[] args) {
    FunctionD functionD = new FunctionD();
    boolean[] check = new boolean[10001];

    for (int i = 0; i < 10001; i++) {
      int number = functionD.function_d(i);

      if (number < 10001) {
        check[number] = true;
      }
    }
    StringBuffer stringBuffer = new StringBuffer();

    for (int i = 0; i <10001; i++) {
      if (!check[i])
        stringBuffer.append(i).append('\n');
    }
    System.out.println(stringBuffer);
  }
}

class FunctionD {

  public FunctionD() {
  }

  int function_d(int x) {
    int tmp = x;
    int res = 0;
    while (x != 0) {
      res += x % 10;
      x /= 10;
    }
    return res + tmp;
  }
}

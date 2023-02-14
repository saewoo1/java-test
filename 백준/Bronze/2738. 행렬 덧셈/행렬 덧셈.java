import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> arrList = Arrays.stream(bufferedReader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    List<List<Integer>> A = new ArrayList<>();
    List<List<Integer>> B = new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < arrList.get(0); i++) {
      A.add(Arrays.stream(bufferedReader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
    }
    for (int i = 0; i < arrList.get(0); i++) {
      B.add(Arrays.stream(bufferedReader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
    }
    for (int i = 0; i < arrList.get(0); i++) {
      for (int j = 0; j < arrList.get(1); j++) {
        res.add(A.get(i).get(j) + B.get(i).get(j));
      }
    }
    for (int i = 0; i < res.size(); i++) {
      System.out.print(res.get(i) + " ");
      if ((i + 1) % arrList.get(1) == 0)
        System.out.println();
    }
  }
}

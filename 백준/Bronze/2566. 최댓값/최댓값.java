import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    FindMin findMin = new FindMin();

    int[][] arr = new int[9][9];
    for (int i = 0; i < 9; i++) {
      String[] input = br.readLine().split(" ");
      for (int j = 0; j < 9; j++) {
        arr[i][j] = Integer.parseInt(input[j]);
      }
    }
    int[] min = new int[2];
    int[] tmp;
    int y = 0;
    for (int i = 0; i < 9; i++) {
      tmp = findMin.find_idx(arr[i]);
      if (min[1] < tmp[1]) {
        y = i;
        min[0] = tmp[0];
        min[1] = tmp[1];
      }
    }
    System.out.println(min[1]);
    System.out.println((y + 1) + " " + (min[0] + 1));
  }
}

class FindMin {
  int[] find_idx(int[] arr) {
    int[] min_pos = new int[2];
    int min = -101;

    for (int i = 0; i < arr.length; i++) {
      if (min < arr[i])
      {
        min = arr[i];
        min_pos[0] = i;
        min_pos[1] = arr[i];
      }
    }
    return min_pos;
  }
}

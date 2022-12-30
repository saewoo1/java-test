import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    int second = 0;
    for (int i = 0; i < word.length(); i++) {
      switch (word.charAt(i)) {
        case 'A':
        case 'B':
        case 'C':
          second += 3;
          break;
        case 'D' : case 'E' : case 'F':
          second += 4;
          break;
        case 'G' : case 'H' : case 'I':
          second += 5;
          break;
        case 'J' : case 'K' : case 'L' :
          second += 6;
          break;
        case 'M' : case 'N' : case 'O' :
          second += 7;
          break;
        case 'P' : case 'Q' : case 'R' : case 'S' :
          second += 8;
          break;
        case 'T' : case 'U' : case 'V' :
          second += 9;
          break;
        case 'X' : case 'W' : case 'Y' : case 'Z' :
          second += 10;
          break;
      }
    }
    System.out.println(second);
  }
}

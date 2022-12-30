import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 0;

    String test = scanner.nextLine();
    for (int i = 0; i < test.length(); i++) {
      if (test.charAt(i) == 'c') {
        if (i < test.length() - 1) {
          if (test.charAt(i + 1) == '=' || test.charAt(i + 1) == '-') {
            i++;
          }
        }
      } else if (test.charAt(i) == 'd') {
        if (i < test.length() - 1) {
          if (test.charAt(i + 1) == 'z') {
            if (i < test.length() - 2) {
              if (test.charAt(i + 2) == '=') {
                i += 2;
              }
            }
          } else if (test.charAt(i + 1) == '-') {
            i++;
          }
        }
      } else if (test.charAt(i) == 'l') {
        if (i < test.length() - 1) {
          if (test.charAt(i + 1) == 'j') {
            i++;
          }
        }
      } else if (test.charAt(i) == 'n') {
        if (i < test.length() - 1) {
          if (test.charAt(i + 1) == 'j')
            i++;
        }
      } else if (test.charAt(i) == 's') {
        if (i < test.length() - 1) {
          if (test.charAt(i + 1) == '=')
            i++;
        }
      } else if (test.charAt(i) == 'z') {
        if (i < test.length() - 1) {
          if (test.charAt(i + 1) == '=') {
            i++;
          }
        }
      }
      count++;
    }
    System.out.println(count);
  }
}

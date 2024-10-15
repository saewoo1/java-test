import java.util.Scanner;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] change = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            char c = change[i];
            if (Character.isLowerCase(c)) {
                change[i] = Character.toUpperCase(c);
            }
            if (Character.isUpperCase(c)) {
                change[i] = Character.toLowerCase(c);
            }
        }
        System.out.println(new String(change));
    }
}
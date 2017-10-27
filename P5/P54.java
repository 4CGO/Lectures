package P5;

import java.util.Scanner;

public class P54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = sc.next();
        System.out.println("Middle character/s: " + middle(str));
    }

    public static String middle(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
        } else {
            return str.substring(str.length() / 2, str.length() / 2 + 1);
        }
    }
}

package Additional_Tutorial_3;

import java.util.Scanner;

public class P43b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input strings : ");
        String letters = sc.nextLine();
        int count = 1;
        for (int i = 0; i < letters.length(); i++) {
            if (Character.isSpaceChar(letters.charAt(i))) {
                count = 0;
            }
            if (count == 2) {
                System.out.print(letters.charAt(i));
            }
            count++;
        }
    }
}

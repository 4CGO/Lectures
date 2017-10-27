package Additional_Tutorial_3;

import java.util.Scanner;

public class P43e {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input strings : ");
        String letters = sc.nextLine();
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.toLowerCase().charAt(i);
            if (letter == 'a') {
                System.out.println("A in position " + (i + 1));
            } else if (letter == 'e') {
                System.out.println("E in position " + (i + 1));
            } else if (letter == 'i') {
                System.out.println("I in position " + (i + 1));
            } else if (letter == 'o') {
                System.out.println("O in position " + (i + 1));
            } else if (letter == 'u') {
                System.out.println("U in position " + (i + 1));
            }
        }

    }
}

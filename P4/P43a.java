package Additional_Tutorial_3;

import java.util.Scanner;

public class P43a {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input strings : ");
        String letters = sc.nextLine();
        for (int i = 0; i < letters.length(); i++) {
            if (letters.charAt(i) == (letters.toUpperCase()).charAt(i) && Character.isAlphabetic(letters.charAt(i))) {
                System.out.print(letters.charAt(i));
            }
        }
    }
}

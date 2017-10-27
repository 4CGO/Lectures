package Additional_Tutorial_3;

import java.util.Scanner;

public class P43c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input strings : ");
        String letters = sc.nextLine();
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.toLowerCase().charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.print("_");
            }else{
                System.out.print(letters.charAt(i));
            }
        }
    }
}

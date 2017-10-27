package Additional_Tutorial_3;

import java.util.Scanner;

public class P43d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input strings : ");
        String letters = sc.nextLine();
        int vowelCount = 0;
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.toLowerCase().charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels : " + vowelCount);
    }
}

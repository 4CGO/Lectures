package P5;

import java.util.Scanner;

public class P53a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a numbers: ");
        int num = sc.nextInt();
        System.out.println("First digit: " + firstDigit(num));
    }

    public static int firstDigit(int n) {
        return Character.getNumericValue(Integer.toString(n).charAt(0));
    }
}

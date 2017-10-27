package P5;

import java.util.Scanner;

public class P53b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a numbers: ");
        int num = sc.nextInt();
        System.out.println("Last digit: " + lastDigit(num));
    }

    public static int lastDigit(int n) {
        return n%10;
    }
}

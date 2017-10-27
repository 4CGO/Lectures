package Additional_Tutorial_3;

import java.util.Scanner;

public class P41e {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, sepDigit;
        System.out.print("Input value : ");
        int val = sc.nextInt();
        while (0 < val) {
            sepDigit = val % 10;
            if (sepDigit % 2 != 0) {
                sum = sum + sepDigit;
            }
            val = val / 10;
        }
        System.out.println(sum);
    }
}

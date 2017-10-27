package P5;

import java.util.Scanner;

public class P51a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        System.out.println("Smallest number: " + smallest(num1, num2, num3));
    }

    public static double smallest(double x, double y, double z) {
        return Math.min(Math.min(x, y), z);
    }
}

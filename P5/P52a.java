package P5;

import java.util.Scanner;

public class P52a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        System.out.println("Arguments are all the same: " + allTheSame(num1, num2, num3));
    }

    public static boolean allTheSame(double x, double y, double z) {
        return x == y && y == z;
    }
}

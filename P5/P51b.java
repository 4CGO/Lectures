package P5;

import java.util.Scanner;

public class P51b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        System.out.println("Average: " + average(num1, num2, num3));
    }

    public static double average(double x, double y, double z) {
        return (x+y+z)/3;
    }
}

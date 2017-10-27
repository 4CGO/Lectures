package P5;

import java.util.Scanner;

public class P53c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a numbers: ");
        int num = sc.nextInt();
        System.out.println("Number of digits: " + digits(num));
    }

    public static int digits(int n) {
        return (Integer.toString(n).length());
    }
}

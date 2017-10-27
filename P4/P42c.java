package Additional_Tutorial_3;

import java.util.Scanner;

public class P42c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer sequence (seperate with space)");
        String[] seqOfVal = sc.nextLine().split("\\ ");
        int sum=0;
        for (String val : seqOfVal) {
            sum = sum + Integer.parseInt(val);
            System.out.print(sum+" ");
        }
    }
}

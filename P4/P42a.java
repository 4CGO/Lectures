package Additional_Tutorial_3;

import java.util.Scanner;

public class P42a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer sequence (seperate with space)");
        String[] seqOfVal = sc.nextLine().split("\\ ");
        int maxVal = Integer.parseInt(seqOfVal[0]), minVal = Integer.parseInt(seqOfVal[0]);
       for (String val : seqOfVal) {
            if (maxVal < Integer.parseInt(val)) {
                maxVal = Integer.parseInt(val);
            }
            if (minVal > Integer.parseInt(val)) {
                minVal = Integer.parseInt(val);
            }
        }
        System.out.println("Max value : " + maxVal);
        System.out.println("Min value : " + minVal);
    }
}

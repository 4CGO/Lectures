package Additional_Tutorial_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P42b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer sequence (seperate with space)");
        String[] seqOfVal = sc.nextLine().split("\\ ");
        List<String> even = new ArrayList<>();
        List<String> odd = new ArrayList<>();
        for (String val : seqOfVal) {
            if (Integer.parseInt(val) % 2 == 0) {
                even.add(val);
            } else {
                odd.add(val);
            }
        }
        System.out.println("Even values : " + odd);
        System.out.println("Odd values : " + even);
    }
}

package Additional_Tutorial_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P42d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer sequence (seperate with space)");
        String[] seqOfVal = sc.nextLine().split("\\ ");
        List<String> newSeqOfVal = new ArrayList<>();
        int count = 0;
        for (String val : seqOfVal) {
            for (String val2 : seqOfVal) {
                if (val.equals(val2)) {
                    count++;
                }
                if (count >= 2) {
                    if (!newSeqOfVal.contains(val2)) {
                        newSeqOfVal.add(val2);
                    }
                    count = 0;
                }
            }
            count = 0;
        }
        for (String val : newSeqOfVal) {
            System.out.print(val + " ");
        }
    }
}

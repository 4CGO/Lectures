package Additional_Tutorial_3;

import java.util.Scanner;

public class P41d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Input start value : ");
        int stNum = sc.nextInt();
        System.out.print("Input end value : ");
        int enNum = sc.nextInt();
        while (stNum <= enNum) {
            if(stNum%2==0){
                stNum++;
            }
            sum = sum + stNum;
            stNum++;
        }
        System.out.println(sum);
    }
}

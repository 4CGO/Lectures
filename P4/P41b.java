package Additional_Tutorial_3;

public class P41b {

    public static void main(String[] args) {
        int sum = 0, count = 1;
        while ((count * count) <= 100) {
            sum = sum + (count * count);
            count++;
        }
        System.out.println(sum);
    }
}

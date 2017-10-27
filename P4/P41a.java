package Additional_Tutorial_3;

public class P41a {

    public static void main(String[] args) {
        int sum = 0, count = 2;
        while (count <= 100) {
            sum = sum + count;
            count = count + 2;
        }
        System.out.println(sum);
    }
}

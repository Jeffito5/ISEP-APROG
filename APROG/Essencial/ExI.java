package Essencial;
import java.util.Scanner;
public class ExI {
    public static void main(String[] args) {

        int num1, num2, num3, mmc, n, num4;
        Scanner ler = new Scanner(System.in);
        num1 = ler.nextInt();
        num2 = ler.nextInt();
        num3 = num2;
        num4 = num1;
        n = 2;

        if (num1 > num2) {
            while (num4 % num2 != 0) {
                num4 = num1 * n;
                n = n + 1;
            }
            System.out.println(num4);
        } else {
            while (num3 % num1 != 0) {
                num3 = num2 * n;
                n = n + 1;

            }
            System.out.println(num3);

        }

    }
}

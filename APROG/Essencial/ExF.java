package Essencial;
import java.util.Scanner;
public class ExF {
    public static void main(String[] args) {
        int num, alg, num1, num2 = 0;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        num1 = 0;
        num2 = num;

        while (num > 0) {
            alg = num % 10;
            num1 = num1 * 10 + alg;
            num = num / 10;
        }
        if (num2 == num1) {
            System.out.println("capicua");
        } else {
            System.out.println("nao capicua");
        }
    }
}

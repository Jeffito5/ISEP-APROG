package Essencial;
import java.util.Scanner;
public class ExA {
    public static void main(String[] args) {
        int num, alg;
        int count = 0;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        while (num > 0) {
            alg = num % 10;
            if (alg % 2 == 0) {
                count +=alg;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}

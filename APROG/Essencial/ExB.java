package Essencial;
import java.util.Scanner;
public class ExB {
    public static void main(String[] args) {
        int num, alg, somaPares;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        somaPares = 0;
        while (num > 0) {
            while (num != 0) {
                alg = num % 10;
                if (alg % 2 == 0) {
                    somaPares = somaPares + alg;
                }
                num = num / 10;

            }
            System.out.println(somaPares);
            somaPares = 0;
            num = ler.nextInt();
        }
    }
}

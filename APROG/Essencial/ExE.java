package Essencial;
import java.util.Scanner;
public class ExE {
    public static void main(String[] args) {
        int num, alg, ord, num1, soma;
        final int BASE = 8;
        boolean valido = true;
        num1 = 0;
        ord = 0;
        soma = 0;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        do {
            while (num > 0 && valido == true) {
                alg = num % 10;
                num = num / 10;
                if (alg >= BASE) {
                    valido = false;
                } else {
                    num1 = (int) (alg * Math.pow(BASE, ord));
                    ord = ord + 1;
                    soma = soma + num1;
                }
            }
            if (valido == true) {
                System.out.println(soma);
            }
            num1 = 0;
            ord = 0;
            soma = 0;
            num = ler.nextInt();
        } while (num >= 0);
    }
}

package Essencial;
import java.util.Scanner;
public class ExD {
    public static void main(String[] args) {

        int num, alg, prod;

        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();

        while (num > 0) {
            boolean temImpares = false;
            prod = 1;
            while (num > 0) {
                alg = num % 10;
                num = num / 10;
                if (alg % 2 != 0) {
                    prod = prod * alg;
                    temImpares = true;
                }
            }
            if (temImpares == false) {
                System.out.println("nao ha algarismos impares");
            } else {
                System.out.println(prod);
                num = ler.nextInt();
            }
        }
    }
}

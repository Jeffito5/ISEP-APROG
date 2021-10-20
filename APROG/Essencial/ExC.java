package Essencial;
import java.util.Scanner;
public class ExC {
    public static void main(String[] args) {
        int num, alg, prod;
        boolean temImpares = false;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        prod = 1;
        while (num > 0) {
            while(num!=0){
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
            }
        }
    }
}

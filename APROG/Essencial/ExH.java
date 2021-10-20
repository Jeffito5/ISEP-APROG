package Essencial;
import java.util.Scanner;
public class ExH {
    public static void main(String[] args) {
        int num, i, div, cont;
        cont = 0;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        for (i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                cont = cont + 1;

            }
        }
        if (cont > 2) {
            System.out.println("nao e primo");
        } else {
            System.out.println("primo");
        }
    }
}

package Essencial;
import java.util.Scanner;
public class ExG {
    public static void main(String[] args) {
        int num, i, cont;
        cont = 0;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();

        for (i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                cont = cont + 1;
                System.out.println(i);
            }
        }
        System.out.println(num);
        cont = cont + 1;

        System.out.println("(" + cont + ")");

    }
}

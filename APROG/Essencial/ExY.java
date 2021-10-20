package Essencial;
import java.util.Scanner;
public class ExY {
    public static void main(String[] args) {

        int num, i, cont;
        cont = 0;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        for (i = 1; i < num; i++) {
            if (num % i == 0 && i % 3 == 0) {
                System.out.println(i);
                cont++;

            }

        }
        if (cont == 0) {
            System.out.println("sem divisores multiplos de 3");
        }
    }
}

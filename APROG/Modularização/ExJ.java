package Modularização;
import java.util.Scanner;
public class ExJ {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int n1, i;
        n1 = ler.nextInt();
        if (n1 >= 0 && n1 <= 100) {
            for (i = 0; i < 30; i++) {
                System.out.println();
            }
            System.out.println(jogo(n1));
        }
    }

    public static int jogo(int n1) {
        int n2, n = 1;
        n2 = ler.nextInt();
        while (n2 != n1) {
            if (n2 < n1) {
                System.out.println("Tente maior");
            }
            if (n2 > n1) {
                System.out.println("Tente menor");
            }
            n++;
            n2 = ler.nextInt();
        }
        if (n2 == n1) {
            System.out.println("Acertou");
        }
        return n;
    }
}

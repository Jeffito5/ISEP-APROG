package Essencial;
import java.util.Scanner;
public class ExK {
    public static void main(String[] args) {
        int num, i, i2, cont;

        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        if (num <= 1) {
        } else {
            for (i = 1; i <= num; i++) {
                cont = 0;

                for (i2 = 1; i2 <= num; i2++) {
                    if (i % i2 == 0) {
                        cont++;

                    }

                }
                if (cont == 2) {
                    System.out.println(i);
                }
            }
        }
    }
}

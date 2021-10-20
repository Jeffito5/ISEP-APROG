package Essencial;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ExJ {
    public static void main(String[] args) {

        int n = 0, i, vezes, a, div, dig;
        double x, xtotal, res, perc, percmaior;
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner input = new Scanner(System.in);
        vezes = input.nextInt();
        /**
         * introduz-se o numero de numeros a ler*
         */
        percmaior = -1;
        if (vezes > 0) {
            for (a = 0; a < vezes; a++) {
                n = input.nextInt();
                /**
                 * numero que se coloca *
                 */
                div = n;
                x = 0;
                xtotal = 0;
                if (n > 0) {
                    do {
                        dig = div % 10;
                        /**
                         * digito *
                         */
                        for (i = 1; i <= 9; i++) {
                            if (n % i == 0 && dig == i) {
                                x++;
                            }
                        }
                        xtotal++;
                        div = div / 10;
                    } while (div > 0);
                }
                res = (x / (xtotal));
                perc = res * 100;
                System.out.println(((df.format(perc)) + "%"));
                if (perc > percmaior) {
                    percmaior = perc;
                }

            }
            System.out.println("(" + df.format(percmaior) + "%)");
        }

    }
}

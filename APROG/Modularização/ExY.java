package Modularização;
import java.util.Scanner;
public class ExY {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarTabuadasDoIntervalo();

    }

    public static int lerValorInteiroPositivo() {
        int num;
        do {
            num = ler.nextInt();
        } while (num > 0);
        return num;
    }

    public static int mostrarTabuadasDoIntervalo() {
        int n1, n2, numero;
        numero = lerValorInteiroPositivo();
        n1 = ler.nextInt();
        n2 = ler.nextInt();
        if (n2 > n1 && numero > n1 && numero < n2) {
            for (int i = 1; i == 10; i++) {
                numero = numero * i;

            }
        }
        if (n1 > n2 && numero > n2 && numero < n1) {
            for (int i = 1; i == 10; i++) {
                numero = numero * i;
                System.out.println(numero);
            }
        }
        return numero;

    }

}

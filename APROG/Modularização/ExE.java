package Modularização;
import java.util.Scanner;
public class ExE {
    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {

        int N, num1, num2, i, b, maiorQtd = 0, num3 = 0, num4 = 0;

        //System.out.print("Insira a quantidade de pares de nÃºmeros:");
        N = tec.nextInt();
        if (N >= 2) {
            for (i = 1; i <= N; i++) {
                //System.out.print("nÃºmero 1:");
                num1 = tec.nextInt();
                //System.out.print("nÃºmero 2:");
                num2 = tec.nextInt();
                if (num1 > 0 && num2 > 0) {
                    b = qtdDigitos(num1, num2);
                    if (b >= maiorQtd && b != 0) {
                        maiorQtd = b;
                        num3 = num1;
                        num4 = num2;
                    }
                }
            }
            if (maiorQtd == 0) {
                System.out.println("sem resultados");
            } else {
                System.out.println(num3 + "/" + num4);
            }
        }
    }
//------------------------------------------------------------------------------

    public static int qtdDigitos(int num1, int num2) {

        int a = 0, digito1, digito2;

        while (num1 != 0 || num2 != 0) {
            digito1 = num1 % 10;
            digito2 = num2 % 10;
            if (digito1 == digito2) {
                a++;
            }
            num1 = num1 / 10;
            num2 = num2 / 10;
        }
        return a;
    }
}

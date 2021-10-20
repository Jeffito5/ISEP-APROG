package Modularização;
import java.util.Scanner;
public class ExD {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
            int m, n;
            Scanner ler = new Scanner(System.in);
            m = ler.nextInt();
            n = ler.nextInt();
            if (m >= n) {
                System.out.println("C(" + m + "," + n + ")=" + combinaçoes(m, n));
                System.out.println("P(" + m + "," + n + ")=" + permutaçoes(m, n));
            }
        }

        public static int fatorial(int m) {
            int resultado = 1;
            for (int i = 1; i <= m; i++) {
                resultado = resultado * i;
            }
            return (resultado);
        }

        public static int combinaçoes(int m, int n) {
            int resultado;
            resultado = fatorial(m) / (fatorial(n) * fatorial(m - n));
            return (resultado);
        }

        public static int permutaçoes(int m,int n){
            int resultado;
            resultado=fatorial(m)/fatorial(m-n);
            return (resultado);
        }
    }


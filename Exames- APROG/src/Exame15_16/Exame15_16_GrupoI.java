package Exame15_16;

import java.util.Scanner;

public class Exame15_16_GrupoI {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Introduza um número binário");
        System.out.print("Binário:");
        int num = ler.nextInt();
        int[] arr = new int[32];
        int alg, i = 0, cont1 = 0, cont0 = 0;
        while (num > 0) {
            while (num != 0) {
                alg = num % 10;
                num = num / 10;
                arr[i] = alg;
                i++;
            }
        }
        for (int k : arr) {
            if (k == 1) {
                cont1++;
                cont0=0;
            } else {
                if (cont1 > 0) {
                    System.out.print(cont1);
                }
                if (k == 0) {
                    cont0++;
                    cont1=0;
                } else {
                    if (cont0 > 0) {
                        System.out.print(cont0);
                        cont0 = 0;
                    }
                }
            }
        }
    }
}
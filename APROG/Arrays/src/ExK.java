package Arrays.src;

import java.util.Scanner;
import java.util.Arrays;

public class ExK {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int n = ler.nextInt();
        int[] num = preencheArray(n);
        verificaRepetidos(num, n);
    }
    public static int[] preencheArray(int n) {
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = ler.nextInt();
        }
        return numeros;
    }
    public static void verificaRepetidos(int[] numeros, int num) {
        int[] unicos=new int[numeros.length];
        int qtd=0;
        for(int i=0;i<numeros.length;i++) {
            boolean existe = false;
            for(int j=0;j<qtd;j++) {
                if(unicos[j]==numeros[i]) {
                    existe=true;
                    break;
                }
            }
            if(!existe) {
                unicos[qtd++]=numeros[i];
            }
        }
        unicos=Arrays.copyOf(unicos,qtd);
        for(int i=0;i<unicos.length;i++) {
            System.out.println(unicos[i]);
        }
    }
}
package Arrays.src;

import java.util.Scanner;

public class ExL {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num=preencheArray();
        vizinhos(num);
    }
    public static int[] preencheArray() {
        int n,i=0;
        int[] numeros = new int[30];
        n=ler.nextInt();
        numeros[i]=n;
        i++;
        while(n>0){
            n=ler.nextInt();
            numeros[i]=n;
            i++;
        }
        return numeros;
    }
    public static void vizinhos(int[] numeros){
        for(int i=0;i+2<numeros.length;i++){
            int num1=numeros[i];
            int num2=numeros[i+1];
            int num3=numeros[i+2];
            if(num2>num1 && num2>num3){
                System.out.println(num2);
            }
        }
    }
}

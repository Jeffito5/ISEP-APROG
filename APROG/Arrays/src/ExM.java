package Arrays.src;

import java.util.Arrays;
import java.util.Scanner;

public class ExM {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] num = preencheArray();
        int i=0;
        while(num[i]!=0){
            System.out.println(num[i] + ":" + contAlgDif(num, i));
            i++;
        }
    }
    public static int[] preencheArray() {
        int n,i=0;
        int[] numeros=new int[30];
        n=ler.nextInt();
        numeros[i]=n;
        i++;
        while(n>0) {
            n=ler.nextInt();
            numeros[i]=n;
            i++;
        }
        return numeros;
    }
    public static int contAlgDif(int[] numeros, int num) {
        int numero=numeros[num];
        int[] algArr = new int[30];
        int i=0;
        while(numero!=0) {
            int alg=numero%10;
            numero=numero/10;
            algArr[i]=alg;
            i++;
        }
        int[] unicos=new int[algArr.length];
        for(int l=0;l<algArr.length;l++){
            unicos[l]=-1;
        }
        int qtd=0;
        for(int j=0;j<algArr.length;j++) {
            boolean existe=false;
            for(int k=0;k<qtd;k++) {
                if(unicos[k]==algArr[j]) {
                    existe=true;
                    break;
                }
            }
            if(!existe) {
                unicos[qtd++]=algArr[j];
            }
        }
        unicos=Arrays.copyOf(unicos,qtd);
        return unicos.length-1;
    }
}

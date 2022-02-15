package Exame15_16;

import java.util.Arrays;
import java.util.Scanner;

public class Exame15_16_GrupoII {
    public static int[][] lerMatriz(int i, int j) {
        int[][] matriz = new int[i][j];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; j++) {
                matriz[k][l] = (int) Math.random();
            }
        }
        return matriz;
    }

    public static void escreverVetor(int[] vec, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(vec));
        }
    }

    static int[] somarPosicoesComunsEmVetores(int[] vecPares, int[] vecImpares, int contPares, int contImpares) {
        int[] vecSoma = new int[vecImpares.length];
        int i = 0;
        while (i != contPares && i != contImpares) {
            vecSoma[i] = vecPares[i] + vecImpares[i];
            i++;
        }
        return vecSoma;
    }

    public static int extrairVetorMultiplos(int[][] matriz, int n, int[] vec) {
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % n == 0) {
                    cont++;
                    vec[j] = matriz[i][j];
                }
            }
        }
        return cont;
    }

    int[] extrairElementosNaoPertencentes(int[][] matriz, int[] vec, int num) {
        int[] vetor = new int[num];
        int l = 0;
        while (l != num) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if (matriz[i][j] != vec[l]) {
                        vetor[l] = vec[l];
                    }
                }
            }
            l++;
        }
        return vetor;
    }
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n=ler.nextInt();
        int j= ler.nextInt();
        int[][] matriz=lerMatriz(n,j);
        int[] vecPares=new int[n];
        int[] vecImpares=new int[n];
        for(int i=0;i<n;i++){
            for(int l=0;l<j;l++){
                if(matriz[i][l]%2==0){
                    vecPares[i]=matriz[i][l];
                }else{
                    vecImpares[i]=matriz[i][l];
                }
            }
        }
        System.out.println(Arrays.toString(vecPares));
        System.out.println(Arrays.toString(vecImpares));
        int a= vecPares.length;
        int b= vecImpares.length;
        int[] vec=new int[a];
        vec=somarPosicoesComunsEmVetores(vecPares,vecImpares,a,b);
    }
}

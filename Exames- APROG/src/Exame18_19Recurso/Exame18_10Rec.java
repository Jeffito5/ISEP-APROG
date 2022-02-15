package Exame18_19Recurso;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Exame18_10Rec {
    private static final int MAX_APOSTAS = 5;
    private static final int N_NUMEROS = 5;
    private static final int N_ESTRELAS = 2;

    public static boolean apostaValida(int[] aposta) {
        boolean flag = false;
        int contNum = 0, contEstr = 0;
        for (int i = 0; i < N_NUMEROS; i++) {
            if (aposta[i] < 1 || aposta[i] > 50) {
                return flag;
            } else {
                contNum++;
            }
        }
        for (int j = 5; j < (N_NUMEROS + N_ESTRELAS); j++) {
            if (aposta[j] < 1 || aposta[j] > 12) {
                return flag;
            } else {
                contEstr++;
            }
        }
        if (contNum > N_NUMEROS || contNum < N_NUMEROS || contEstr > N_ESTRELAS || contEstr < N_ESTRELAS) {
            return flag;
        } else {
            return !flag;
        }
    }

    public static int lerApostas(String nomeFicheiro, int[][] matrizValida) throws FileNotFoundException {
        int cont = 0, MaxApostas = 0, MaxNum = 0;
        int[] matrix = new int[N_NUMEROS + N_ESTRELAS];
        Scanner in = new Scanner(new File(nomeFicheiro));    /** abre o ficheiro **/
        while (MaxApostas != MAX_APOSTAS) {
            while (MaxNum != N_NUMEROS + N_ESTRELAS) {
                while (in.hasNextLine()) {                           /** verifica se o ficheiro tem linhas **/
                    in.nextLine();                                   /** passa para a segunda linha **/
                    String line = in.nextLine();                      /** extrai a segunda linha para colocar no array **/
                    String[] lineSplitted = line.split("[ +]");    /** corta a linha a ser verificada pelo espaço e pelo + **/
                    for (int i = 0; i < N_NUMEROS + N_ESTRELAS; i++) {
                        matrix[i] = Integer.parseInt(lineSplitted[i]);    /** ocupa o array **/
                    }
                    boolean flag = apostaValida(matrix);
                    if (flag = true) {
                        cont++;
                        ordenarAposta(matrix);
                        matrizValida[MaxApostas][MaxNum] = matrix[MaxNum];
                    }
                }
            }
        }
        return cont;
    }

    public static void main(String[] args) throws FileNotFoundException {
        int[][] matrizValida = new int[MAX_APOSTAS][N_NUMEROS + N_ESTRELAS];
        int numApostasValidas = 0;
        numApostasValidas = lerApostas("euromilhoes.txt", matrizValida);
        mostrarApostas(matrizValida, numApostasValidas);
    }

    private static void ordenarAposta(int[] aposta) {
        for (int i = 0; i < aposta.length - 1; i++) {
            for (int j = i + 1; j < aposta.length; j++) {
                if (aposta[j] < aposta[i]) {
                    int aux = aposta[i];
                    aposta[i] = aposta[j];
                    aposta[j] = aux;
                }
            }
        }
    }

    private static void mostrarApostas(int[][] apostas, int nApostas) {
        System.out.println("O número de apostas válidas são " + nApostas);
        System.out.println("Apostas:");
        for (int[] row : apostas) {
            System.out.println(Arrays.toString(row));
        }
    }
}






















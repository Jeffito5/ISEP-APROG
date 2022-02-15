package Exame19_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exame19_20 {
    static final int FILAS = 24;
    /**
     * número de filas
     **/
    static final int LUGARES = 30;

    /**
     * número de lugares
     **/

    public static int[][] lerOcupacaoDaSala(String nomeFicheiro) throws FileNotFoundException {
        Scanner in = new Scanner(new File(nomeFicheiro));    /** abre o ficheiro **/
        int[][] arrSalaOcupada = new int[FILAS][LUGARES];     /** cria o array **/
        while (in.hasNextLine()) {                           /** verifica se o ficheiro tem linhas **/
            String line = in.nextLine();                      /** extrai a primeira linha para colocar no array **/
            String[] lineSplitted = line.split(";");    /** corta a linha a ser verificada pelo ; **/
            int filas = 0;
            while (filas != 23) {
                for (int i = 0; i < lineSplitted.length-1; i++) {
                    arrSalaOcupada[filas][i] = Integer.parseInt(lineSplitted[i]);    /** ocupa o array **/
                }
                filas++;
            }
        }
        in.close();
        return arrSalaOcupada;
    }

    public static int calcularBilheteira(int[][] arrSalaOcupada) {
        int valorTotal = 0, valor20 = 0, valor15 = 0, valor10 = 0, cont20 = 0, cont15 = 8, cont10 = 16;
        while (cont20 != 7) {
            for (int i = 1; i < 30; i++) {                  /** verifica as filas cujo bilhete é 20 euros **/
                if (arrSalaOcupada[cont20][i] == 1) {
                    valor20 += 20;
                }
            }
            cont20++;
        }
        while (cont15 != 15) {
            for (int i = 1; i < 30; i++) {                  /** verifica as filas cujo bilhete é 15 euros **/
                if (arrSalaOcupada[cont15][i] == 1) {
                    valor15 += 15;
                }
            }
            cont15++;
        }
        while (cont10 != 23) {
            for (int i = 1; i < 30; i++) {                  /** verifica as filas cujo bilhete é 10 euros **/
                if (arrSalaOcupada[cont10][i] == 1) {
                    valor10 += 10;
                }
            }
            cont10++;
        }
        valorTotal = valor10 + valor15 + valor20;
        return valorTotal;
    }

    public static int informarLugares(int[][] arrSalaOcupada, int lugaresConsec) {
        int fila = 23, cont = 0;
        while (fila != 0) {                                 /** começa-se das filas mais afastadas **/
            for (int i = 1; i < 31; i++) {
                while (cont != lugaresConsec) {             /** enquanto que o counter não for igual ao lugaresConsec **/
                    if (arrSalaOcupada[fila][i] == 0) {     /** se na fila x no lugar y tiver um 0 aumenta-se o counter **/
                        cont++;
                    } else {
                        cont = 0;
                    }
                }
                if (cont == lugaresConsec) {                /** se o counter for igual ao lugaresConsec enão dá return à fila **/
                    return fila;
                }
            }
            fila--;
        }
        return -1;                                      /** se não houver return da fila dá return a -1 **/
    }

    public static void main(String[] args) throws FileNotFoundException {
        int[][] lugares;
        lugares=lerOcupacaoDaSala("ocupacaoSala2020-01-14.txt");
        int receita=calcularBilheteira(lugares);
        System.out.println("O montante da receita da sala de epetáculos no dia 14/01/2020 foi :" + receita);
        int lugaresConsecutivos=4;
        int lugar=informarLugares(lugares,lugaresConsecutivos);
        System.out.println("A fila com 4 lugares consecutivos é: " + lugar);
    }
}

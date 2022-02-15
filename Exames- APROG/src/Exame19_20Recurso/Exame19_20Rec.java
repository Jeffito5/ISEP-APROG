package Exame19_20Recurso;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Exame19_20Rec {
    static final int DIAS = 7;
    /**
     * número de dias por semana
     **/
    static final int HORAS = 24;

    /**
     * número de horas por dia
     **/

    public static double[][] lerTemperaturasDoFicheiro(String nomeFicheiro) throws FileNotFoundException {
        Scanner in = new Scanner(new File(nomeFicheiro));        /** abre o ficheiro **/
        double[][] arrTempSemana = new double[DIAS][HORAS];           /** cria o array **/
        while (in.hasNextLine()) {                              /** verifica se o ficheiro tem linhas **/
            String line = in.nextLine();                        /** extrai a primeira linha para colocar no array **/
            String[] lineSplitted = line.split(" ");        /** corta a linha a ser verificada pelo espaço **/
            int dias = 0;
            while (dias != 6) {
                for (int i = 0; i < lineSplitted.length; i++) {
                    arrTempSemana[dias][i] = Integer.parseInt(lineSplitted[i]);    /** ocupa o array **/
                }
                dias++;
            }
        }
        in.close();
        return arrTempSemana;
    }

    public static int ligacoesDoAquecimentoNoDia(double[][] arrTempSemana, int diaSemana) {
        int cont = 0;
        for (int i = 8; i < 19; i++) {
            if (arrTempSemana[diaSemana][i] < 10) {
                cont++;
            }
        }
        return cont;
    }

    public static String[] sugestaoParaLigarAquecimentoAsHoras(double[][] arrTempSemana) {
        String[] arraySugestao = new String[HORAS];
        for (int j = 0; j < HORAS; j++) {
            arraySugestao[j] = "F";
        }
        int dias = 0;
        int cont = 0;
        int horas = 8;
        while (horas != 19) {
            while (dias != 7) {
                if (arrTempSemana[dias][horas] < 10) {
                    cont++;
                }
                dias++;
            }
            if (cont == 7) {
                arraySugestao[horas] = "T";
            }
            horas++;
        }
        return arraySugestao;

    }

    public static void main(String[] args) throws FileNotFoundException {
        double[][] temperaturas;
        temperaturas = lerTemperaturasDoFicheiro("temperaturasSemana50.txt");
        int diaDaSemana = 3;
        int numVezesAquecimentoLigado = ligacoesDoAquecimentoNoDia(temperaturas, diaDaSemana);
        System.out.println("O aquecimento no 3º dia foi ligado " + numVezesAquecimentoLigado + " vezes");
        String[] sugestao = sugestaoParaLigarAquecimentoAsHoras(temperaturas);
        System.out.println("Sugestão da ligação do aquecimento:");
        System.out.println(Arrays.toString(sugestao));
    }
}

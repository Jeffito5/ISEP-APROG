package Exame17_18Recurso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.YearMonth;
import java.util.Scanner;

public class Exame17_18Rec {
    static final int BARRAGENS = 180;

    /**
     * número de barragens
     **/
    static final String ANO_MES = "2020-11";

    /**
     * mês utilizado
     **/
    private static int lerDadosBarragens(String nomeFich, int[][] barragens) throws FileNotFoundException {
        int counter = 0;
        Scanner in = new Scanner(new File(nomeFich));    /** abre o ficheiro **/
        while (in.hasNextLine()) {                           /** verifica se o ficheiro tem linhas **/
            String line = in.nextLine();                      /** extrai a primeira linha para colocar no array **/
            String[] lineSplitted = line.split(";");    /** corta a linha a ser verificada pelo ; **/
            for (int i = 0; i < lineSplitted.length - 1; i++) {
                barragens[counter][i] = Integer.parseInt(lineSplitted[i]);    /** ocupa o array **/
            }
            counter++;
        }
        in.close();
        return counter;
    }

    private static int diasMes(String anoMes) throws FileNotFoundException {
        int daysInMonth = 0;
        Scanner in = new Scanner(new File(anoMes));         /** verifica a data **/
        while (in.hasNextLine()) {                           /** verifica se tem linhas **/
            String line = in.nextLine();                      /** extrai a primeira linha para colocar no array **/
            String[] lineSplitted = line.split("-");    /** corta a linha a ser verificada pelo - **/
            YearMonth yearMonthObject = YearMonth.of(Integer.parseInt(lineSplitted[0]), Integer.parseInt(lineSplitted[1]));
            daysInMonth = yearMonthObject.lengthOfMonth();
        }
        return daysInMonth;
    }

    public static int[][] lerNiveis(String nomeFicheiro, int[][] barragens, int numBarragens) throws FileNotFoundException {
        int numeroBarrages = 0, diasDoMes;
        Scanner in = new Scanner(new File(nomeFicheiro));    /** abre o ficheiro **/
        int[][] niveisMedios = new int[numBarragens][63];     /** cria o array **/
        while (in.hasNextLine()) {                           /** verifica se o ficheiro tem linhas **/
            String line = in.nextLine();                      /** extrai a primeira linha para colocar no array **/
            String[] lineSplitted = line.split(";");    /** corta a linha a ser verificada pelo ; **/
            for (int i = 0; i < lineSplitted.length - 1; i++) {
                if (lineSplitted[i] == String.valueOf(barragens[numeroBarrages][0])) {          /** verificaar se o número da barragem está correto **/
                    for (int j = 1; j < lineSplitted.length; j++) {
                        String[] confirmaDia = lineSplitted[j].split("/");
                        diasDoMes = diasMes(ANO_MES);
                        if (Integer.parseInt(confirmaDia[1]) < diasDoMes || Integer.parseInt(confirmaDia[1]) >= 1) {
                            niveisMedios[numeroBarrages][0] = Integer.parseInt(lineSplitted[0]);
                            for (int k = 0; k < confirmaDia.length - 1; k++) {
                                niveisMedios[numeroBarrages][k] = Integer.parseInt(confirmaDia[k]);
                            }

                        }
                    }
                }

            }
            numeroBarrages++;
        }
        return niveisMedios;
    }

    public static int[][] contarDiasCriticos(int[][] niveisMedios, int[][] barragens, int numBarragens) {
        int[][] diasCriticos = new int[numBarragens][2];
        int numDiasCriticos = 0, numBarragens1 = 0;
        while (numBarragens1 != numBarragens) {
            for (int i = 0; i < numBarragens; i++)
                if (niveisMedios[i][0] == barragens[numBarragens1][0]) {
                    for (int j = 1; j < niveisMedios.length; j += 2) {
                        if (niveisMedios[i][j] < barragens[numBarragens1][1] || niveisMedios[i][j] > barragens[numBarragens1][2]) {
                            numDiasCriticos++;
                            diasCriticos[numBarragens1][0] = niveisMedios[i][0];
                            diasCriticos[numBarragens1][1] = numDiasCriticos;
                        }
                    }
                }
            numBarragens1++;
        }
        return diasCriticos;
    }

    public static void listarQuantidadeDiasCriticos(int[][] diasCriticos, int numBarragens) throws FileNotFoundException {
        int numBarragens1 = 0;
        for (int idx1 = 0; idx1 < numBarragens - 1; idx1++) {
            for (int idx2 = idx1 + 1; idx2 < numBarragens; idx2++) {
                if (diasCriticos[idx2][1] < diasCriticos[idx1][1]) {
                    int aux = diasCriticos[idx1][1];
                    diasCriticos[idx1][1] = diasCriticos[idx2][1];
                    diasCriticos[idx2][1] = aux;
                }
            }
        }
        String fileContent = "Barragens com níveis extremos";
        File file = new File("listagem.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.print(fileContent);
        pw.println();
        pw.print("Código    " + "Quantidade de dias");
        while (numBarragens1 != numBarragens) {
            if (diasCriticos[numBarragens1][1] > 0) {
                pw.println(diasCriticos[numBarragens1][0] + "    " + diasCriticos[numBarragens1][1]);
            }
            numBarragens1++;
        }
        pw.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        int[][] barragens = new int[BARRAGENS][3];
        int numBarragens = lerDadosBarragens("barragens.txt", barragens);
        System.out.println("Introduza o nome do ficheiro a ler .txt.");
        String nomeDoFicheiro = in.nextLine();
        int[][] niveis = lerNiveis(nomeDoFicheiro, barragens, numBarragens);
        int[][] diasCriticos = contarDiasCriticos(niveis, barragens, numBarragens);
        listarQuantidadeDiasCriticos(diasCriticos, numBarragens);
    }

}

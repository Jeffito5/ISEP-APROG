package Exame17_18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exame17_18 {
    static final int COLUNAS = 4;

    /**
     * número de colunas
     **/
    public static void main(String[] args) throws FileNotFoundException {
        String[][] tabelaDeAlimentos;
        tabelaDeAlimentos = lerTabelaDeAlimentos("alimentos.txt");
        System.out.println("Introduza uma refeição com um máximo de 10 alimentos");
        String[] refeicao;
        refeicao = introduzirRefeicao();
        int numCalorias = calcularCaloriasDeRefeicao(refeicao, tabelaDeAlimentos);
        gravarRefeicao(refeicao, numCalorias);
    }

    public static String[][] lerTabelaDeAlimentos(String nomeFicheiro) throws FileNotFoundException {
        Scanner in = new Scanner(new File(nomeFicheiro));    /** abre o ficheiro **/
        int linhas = obterQuantidadeDeAlimentos("alimentos.txt");
        String[][] tabelaAlimentos = new String[linhas][COLUNAS];
        while (in.hasNextLine()) {                           /** verifica se o ficheiro tem linhas **/
            String line = in.nextLine();                      /** extrai a primeira linha para colocar no array **/
            String[] lineSplitted = line.split(";");    /** corta a linha a ser verificada pelo ; **/
            int numVezes = 0;
            while (numVezes != linhas - 1) {
                for (int i = 0; i < lineSplitted.length - 1; i++) {
                    tabelaAlimentos[numVezes][i] = String.valueOf(Integer.parseInt(lineSplitted[i]));
                }
                numVezes++;
            }
        }
        in.close();
        return tabelaAlimentos;
    }

    private static int obterQuantidadeDeAlimentos(String nomeFicheiro) throws FileNotFoundException {
        Scanner in = new Scanner(new File(nomeFicheiro));    /** abre o ficheiro **/
        int cont = 0;
        while (in.hasNextLine()) {                           /** verifica se o ficheiro tem linhas **/
            String line = in.nextLine();                      /** extrai a primeira linha para colocar no array **/
            String[] lineSplitted = line.split(";");    /** corta a linha a ser verificada pelo ; **/
            for (int i = 0; i < COLUNAS / 2; i++) {                     /** verifica se algum alimento foi ingerido e se tem quantidade **/
                if (lineSplitted[i] == null) {
                    in.nextLine();
                }
            }
            for (int j = 3; j < COLUNAS; j++) {
                int confirmador = Integer.parseInt(lineSplitted[j]);
                if (confirmador <= 0) {
                    in.nextLine();
                }
            }
            cont++;
        }
        return cont;
    }

    public static int calcularCaloriasDeRefeicao(String[] nomeQuantidade, String[][] tabelaAlimentos) throws FileNotFoundException {
        int linhas = obterQuantidadeDeAlimentos("alimentos.txt");
        int calorias = 0, numVezes = 0;
        for (int i = 0; i < nomeQuantidade.length; i++) {
            String line = nomeQuantidade[i];
            String[] lineSplitted = line.split(";");
            while (numVezes != linhas) {
                for (int j = 0; j < COLUNAS / 2; j++) {
                    if (lineSplitted[0].equals(tabelaAlimentos[numVezes][0]) && lineSplitted[2].equals(tabelaAlimentos[numVezes][2])) {
                        calorias += Integer.parseInt(tabelaAlimentos[numVezes][3]);
                    }
                }
                numVezes++;
            }
        }
        return calorias;
    }


    public static void gravarRefeicao(String[] refeicao, int calorias) {
        int count = 0;
        for (int i = 0; i < refeicao.length; i++) {
            String line = refeicao[i];
            String[] lineSplitted = line.split(";");
            while (count != lineSplitted.length) {
                System.out.println("Alimento                    Quantidade(g/ml)");
                System.out.println("============================================");
                System.out.println(lineSplitted[count] + lineSplitted[count++] + "\n");
            }
            System.out.println("Total de calorias ingeridas:" + calorias);
        }
    }

    private static String[] introduzirRefeicao() {
        String[] nomeQuantidade = new String[10];
        Scanner ler = new Scanner(System.in);
        int count = 0;
        while (count != 10) {
            nomeQuantidade[count] = ler.nextLine() + ";" + ler.nextLine();
            count++;
        }
        return nomeQuantidade;
    }
}


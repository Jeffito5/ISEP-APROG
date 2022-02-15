/**package Exame18_19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exame18_19 {

    private static final int N_EQUIPAS = 4;
    private static void iniciarEquipas(String nomeFicheiro) {
     Lê os nomes das equipas existentes no ficheiro nomeFicheiro e retorna um
    array completamente preenchido com os nomes dessas equipas.

    }

    private static void iniciarPontuacoes() {
     Cria e retorna um array bidimensional de inteiros – matriz das pontuações
    - com tantas linhas quantas as equipas e com três colunas respetivamente
    para o total de pontos, total de golos marcados e total de golos sofridos.

    }

    private static void procurarEquipa(String nomeEquipa, String[] equipas ) {
     Retorna um inteiro que representa a posição da equipa no vetor de equipas
    caso ela exista ou -1 caso não exista

    }

    private static void guardarInfoEmFicheiro (String nomeFich, String[] equipas, int[][] pontuacao ) {
     Guarda a informação em memória num ficheiro de texto cujo nome é passado
    por parâmetro

    }
    total de pontos, total de golos marcados e total de golos sofridos
    Nome equipa 1 – Nome Equipa 2 – Golos marcados pela equipa1 – Golos marcados pela equipa 2
    public static int[][] atualizarPontuacoes(String nomeFicheiro, int[][] pontuacoes) throws FileNotFoundException {
        Scanner in = new Scanner(new File(nomeFicheiro));     abre o ficheiro
        String equipa1,equipa2;
        int golos1,golos2;
        while (in.hasNext()) {
            equipa1=in.next();           lê o nome da primeira equipa
            int result=procurarEquipa();
            if(result==1){
              in.nextLine();
              }

            equipa2=in.next();
            int result=procurarEquipa();
             if(result==1){
              in.nextLine();
              }
             /
            golos1=in.nextInt();
            golos2=in.nextInt();
            int cont=0;
            while(cont!=N_EQUIPAS){
                if(pontuacoes[cont][0]=equipa1){
                    if(golos1>golos2){
                        pontuacoes[cont][1]+=3;
                    }
                    if(golos1<golos2){
                        pontuacoes[cont][1]+=0;
                    }
                    if(golos1==golos2){
                        pontuacoes[cont][1]+=1;
                    }
                    pontuacoes[cont][2]=golos1;
                    pontuacoes[cont][3]=golos2;
                }
                cont++;
            }
        }
        return pontuacoes;
    }

    public static double ordenarInfoOrdemDecrescente(int[][] pontuacoes){
        int coluna=1;
        for(int linha=0;linha<4;linha++){
            for(int linhaSeg=linha+1;linhaSeg<4;linhaSeg++){
                if(pontuacoes[linhaSeg][coluna]>pontuacoes[linha][coluna]){
                    int aux=pontuacoes[linha][coluna];
                    pontuacoes[linha][coluna]=pontuacoes[linhaSeg][coluna];
                    pontuacoes[linhaSeg][coluna]=aux;
                }
                if(pontuacoes[linhaSeg][coluna]==pontuacoes[linha][coluna]){
                    coluna++;
                    if(pontuacoes[linhaSeg][coluna]>pontuacoes[linha][coluna]){
                        int aux=pontuacoes[linha][coluna];
                        pontuacoes[linha][coluna]=pontuacoes[linhaSeg][coluna];
                        pontuacoes[linhaSeg][coluna]=aux;
                    }
                }
            }
        }
        double pontos=0;
        for(int linha1=0;linha1<4;linha1++){
            int coluna1=1;
            pontos=pontuacoes[linha1][coluna1];
        }
        double media=pontos/N_EQUIPAS;
        return media;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String[] nomes=new String[N_EQUIPAS];
        nomes=iniciarEquipas("nomes.txt");
        int[][] matPontuacoes;
        matPontuacoes=iniciarPontuacoes();
        int[][] novasPontuacoes;
        novasPontuacoes=atualizarPontuacoes("resultados.txt", matPontuacoes);
        File file = new File("c:/temp/info.txt");
        double media=ordenarInfoOrdemDecrescente(novasPontuacoes);
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print(novasPontuacoes);
        System.out.println("Pontuação média: " + media);
    }
}**/

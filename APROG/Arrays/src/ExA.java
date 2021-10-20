package Arrays.src;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExA {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int numAlunos;
        System.out.println("Digite o número de alunos:");
        numAlunos=ler.nextInt();
        double notas[]= preencheArray(numAlunos);
        double media=calculaMedia(notas, numAlunos);
        System.out.println("Media=" + new DecimalFormat("#0.#").format(media));
        int numReprovados=calculaReprovados(notas, numAlunos);
        System.out.printf("Reprovados= " + numReprovados);
    }
    public static double[] preencheArray(int numAlunos){
        double[] grades =new double[numAlunos];
        for(int i=0;i<numAlunos;i++){
            grades[i]=ler.nextInt();
        }
        return grades;
    }
    public static double calculaMedia(double[] grades, int numAlunos){
        double media=0, soma=0;
        for(int i=0;i<numAlunos;i++){
            soma+=grades[i];
        }
        media=soma/numAlunos;
        return media;
    }
    public static int calculaReprovados(double[] grades, int numAlunos){
        int reprov=0;
        double nota=0;
        for(int i=0;i<numAlunos;i++){
            nota=grades[i];
            if(nota<10) {
                reprov++;
            }
        }
        return reprov;
    }
}

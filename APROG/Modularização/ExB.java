package Modularização;
import java.util.Scanner;
public class ExB {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {

        int numAlunos;
        int numDisciplinas;
        int numAprovados;
        String disciplina;
        numAlunos = ler.nextInt();
        numDisciplinas = ler.nextInt();
        for (int i = 1; i <= numDisciplinas; i++) {
            disciplina = ler.next();
            numAprovados = ler.nextInt();
            imprimirInfor(disciplina, numAlunos, numAprovados);
        }
    }

    public static void imprimirInfor(String disciplina, int numAlunos, int numAprovados) {

        System.out.println("Disciplina:" + " " + disciplina);
        System.out.println("- Positivas: " + fazAsteriscos(numAprovados));
        System.out.println("- Negativas: " + fazAsteriscos(numAlunos - numAprovados));
    }

    public static String fazAsteriscos(int quant) {
        String texto = "";
        for (int i = 1; i <= quant; i++) {
            texto = texto + "*";
        }
        return texto;
    }
}

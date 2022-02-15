package Exame15_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exame15_16_GrupoIII {
    public static void main(String[] args) throws FileNotFoundException {
        double desconto = calculaDesconto("compras.txt");
        double valor = calculaValor("compras.txt");
        double valorTotal = valor + desconto;
        Scanner ler = new Scanner(System.in);
        System.out.println("Introduza o seu NIF");
        int nif = ler.nextInt();
        String fileContent = "Fatura simplificada";
        File file = new File("fatura.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.print(fileContent);
        pw.println();
        pw.print("NIF: " + nif);
        pw.print("Total desconto: " + desconto);
        pw.print("Total a pagar: " + valorTotal);
        pw.close();
    }

    public static double calculaDesconto(String nomeFicheiro) throws FileNotFoundException {
        double desconto = 0;
        Scanner in = new Scanner(new File(nomeFicheiro));
        while (in.hasNextLine()) {                           /** verifica se o ficheiro tem linhas **/
            in.nextLine();
            String line = in.nextLine();
            String[] lineSplitted = line.split(" ");
            if (lineSplitted.length > 1) {
                String line2 = in.nextLine();
                String[] lineSplitted2 = line2.split("=");
                desconto += Integer.parseInt(lineSplitted[0]) * Integer.parseInt(lineSplitted2[1]);
            }
        }
        return desconto;
    }

    public static double calculaValor(String nomeFicheiro) throws FileNotFoundException {
        double valor = 0;
        Scanner in = new Scanner(new File(nomeFicheiro));
        while (in.hasNextLine()) {
            in.nextLine();
            String line = in.nextLine();
            String[] lineSplitted = line.split(" ");
            valor += Integer.parseInt(lineSplitted[0]);
            in.nextLine();
        }
        return valor;
    }
}

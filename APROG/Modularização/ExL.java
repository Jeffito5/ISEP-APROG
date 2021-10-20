package Modularização;
import java.util.Scanner;
public class ExL {
    static Scanner ler= new Scanner(System.in);
    public static void main(String[] args) {
        String s;
        s=ler.nextLine();
        int count=contPalavras(s);
        System.out.println(count);
    }
    public static int contPalavras(String s1){
        int contador=s1.split(" ", -1).length-1;
        return contador+1;
    }
}

package Modularização;
import java.util.Scanner;
public class ExK {
    static Scanner ler= new Scanner(System.in);
    public static void main(String[] args) {
        String str;
        char c1;
        char c2;
        str=ler.nextLine();
        c1= ler.next().charAt(0);
        c2=ler.next().charAt(0);;
        trocaChars(str,c1,c2);
    }
    public static void trocaChars(String frase, char char1, char char2){
        for(int i=0; i<frase.length();i++){
            frase=frase.replace(char1,char2);
         }
        System.out.println(frase);
        }
    }


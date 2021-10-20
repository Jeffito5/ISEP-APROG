package Modularização;
import java.util.Scanner;
public class ExM {
    static Scanner ler= new Scanner(System.in);
    public static void main(String[] args) {
        String s;
        s=ler.nextLine();
        int num;
        num=ler.nextInt();
        altera(s,num);
    }
    public static void altera(String s1, int num1){
        if(num1>0){
            System.out.println(s1.toUpperCase());
        }else{
            System.out.println(s1.toLowerCase());
        }
    }
}

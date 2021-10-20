package Modularização;
import java.util.Scanner;
public class ExA {
    static Scanner ler = new Scanner(System.in);

    public static boolean Palindromo(String str) {
        String reverse = "";
        int comprimento = str.length();
        for (int i = 0; i < comprimento; i++) {
            reverse = str.charAt(i) + reverse;
            // System.out.println(reverse);
        }
        if (reverse.equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        String palavra = input.nextLine();
        count = Contador(palavra, count, input);
        System.out.println(count);
    }
//Netbeans refractor

    public static int Contador(String palavra, int count, Scanner input) {
        while (!Palindromo(palavra)) {
            count++;
            palavra = input.nextLine();
        }
        return count;
    }
}

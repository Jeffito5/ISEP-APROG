package Arrays.src;

import java.util.Scanner;
import java.lang.*;

public class ExO {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int n = ler.nextInt();
        int[][] matriz = preencherMatriz(n);
        System.out.println("[" + q2(matriz,n) + "]" + " " + "[" + q1(matriz,n) + "]");
        System.out.println("[" + q3(matriz,n) + "]" + " " + "[" + q4(matriz,n) + "]");
    }
    public static int[][] preencherMatriz(int numero) {
        int[][] m1 = new int[numero][numero];
        int l = 0;
        String s=ler.nextLine();
        String[] str=s.split(" ");
        while (l != numero) {
            for (int i = 0; i < numero; i++) {
                m1[l][i] = Integer.parseInt(str[i]);
            }
            l++;
        }
        return m1;
    }
    public static int q1(int[][] matriz, int num) {
        int count = 0, l = 0;
        while (l != 2) {
            for (int i = 2; i < num; i++) {
                count += matriz[l][i];
            }
            l++;
        }
        return count;
    }
    public static int q2(int[][] matriz, int num){
        int count = 0, l = 0;
        while (l != 2) {
            for (int i = 0; i < num/2; i++) {
                count += matriz[l][i];
            }
            l++;
        }
        return count;
    }
    public static int q3(int[][] matriz, int num){
        int count = 0, l = 2;
        while (l != num) {
            for (int i = 0; i < num/2; i++) {
                count += matriz[l][i];
            }
            l++;
        }
        return count;
    }
    public static int q4(int[][] matriz, int num){
        int count = 0, l = 2;
        while (l != num) {
            for (int i = 2; i < num; i++) {
                count += matriz[l][i];
            }
            l++;
        }
        return count;
    }
}

package Arrays.src;

import java.util.Scanner;

public class ExD {

	static Scanner ler = new Scanner(System.in);

    public static int[] arrayFactory(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ler.nextInt();
        }
        return arr;
    }
    public static int counter(int[] arr, int element) {
        int count = 0;
        for (int i : arr) {
            if (i == element) {
                count++;
            }
        }
        return count;
    }
    public static void printer(int[] arr) {
        for (int i = 0; i < 21; i++) {
            System.out.println(Integer.toString(i) +" "+ counter(arr, i));
        }
    }
    public static void main(String[] args) {
        int[] notas = arrayFactory(ler.nextInt());
        printer(notas);
    }
}
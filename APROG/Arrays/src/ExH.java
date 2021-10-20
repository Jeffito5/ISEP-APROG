package Arrays.src;

import java.util.Scanner;
import java.util.Scanner;

public class ExH {

	static Scanner ler = new Scanner(System.in);

	public static int[] createAndFillArray(int size) {
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = ler.nextInt();
		}
		return result;
	}
	public static void direita(int[] array) {
		int anterior = array[array.length - 1];
		for (int i = 0; i < array.length; i++) {

			// 10 20 30 40 50 - 50 10 20 30 40
			int atual = array[i];
			array[i] = anterior;

			anterior = atual;
		}
		printArray(array, array.length);
	}
	public static void esquerda(int[] array) {
		int anterior = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
			// 10 20 30 40 50 -> 20 30 40 50 10
		}
		array[array.length - 1] = anterior;
		printArray(array, array.length);
	}
	public static void printArray(int[] arr, int numeroElementos) {
		for (int i = 0; i < numeroElementos; i++) {
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		int N = ler.nextInt();
		int[] array = createAndFillArray(N);
		String input = ler.nextLine();
		while (!input.equals("sair")) {
			if (input.equals("esquerda")) {
				esquerda(array);
			} else if (input.equals("direita")) {
				direita(array);
			}
			input = ler.nextLine();
		}
	}
}

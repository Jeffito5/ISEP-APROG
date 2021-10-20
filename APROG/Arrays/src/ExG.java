package Arrays.src;

import java.util.Scanner;

public class ExG {

	static Scanner in = new Scanner(System.in);

	public static int[] createAndFillArray(int size) {
		int[] result = new int[size];
		for (int i = size - 1; i >= 0; i--) {
			result[i] = in.nextInt();
		}
		return result;
	}
	public static void printArrayInvertido(int[] arr, int numeroElementos) {
		for (int i = 0; i < numeroElementos; i++) {
			System.out.print(arr[i]);
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		int N = in.nextInt();
		int[] array = createAndFillArray(N);
		printArrayInvertido(array, N);
	}
}

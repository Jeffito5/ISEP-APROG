package Arrays.src;

import java.util.Scanner;

public class ExI {

	static boolean flag = false;

	public static String[] arrayFactory(Scanner s, int len) {
		String[] arr = new String[4];
		for (int i = 0; i < len; i++) {
			arr[i] = s.nextLine();
		}
		return arr;
	}
	public static void printInfo(String[] arr, int porta, String keyword) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(keyword)) {
				System.out.println("nome=" + arr[i]);
				System.out.println("entrada=" + porta);
				System.out.println("piso=" + i);
				flag = true;
			}
		}

	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] entrada0 = arrayFactory(input, 4);
		String[] entrada1 = arrayFactory(input, 4);
		String[] entrada2 = arrayFactory(input, 4);
		String searchWord = input.nextLine();
		printInfo(entrada0, 0, searchWord);
		printInfo(entrada1, 1, searchWord);
		printInfo(entrada2, 2, searchWord);
		if (!flag) {
			System.out.println("Nao mora no predio");
		}
	}
}



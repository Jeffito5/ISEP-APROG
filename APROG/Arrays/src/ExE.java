package Arrays.src;

import java.util.Scanner;

public class ExE {

	public static double parseDoub(String str) {
		return Double.parseDouble(str);
	}
	public static String[][] arrayFactory(Scanner s) {
		int comprimento = 0;
		String in;
		String[] nome = new String[50];
		String[] capital = new String[50];
		while (true) {
			in = s.nextLine();
			if (in.equals("fim")) {
				break;
			}
			nome[comprimento] = in;
			in = s.nextLine();
			if (in.equals("fim")) {
				break;
			}
			capital[comprimento] = in;
			comprimento++;
		}
		String[][] matriz = condenser(nome, capital, comprimento);
		return matriz;
	}

	public static double media(String[] numbers) {
		double sum = 0.0;
		for (String i : numbers) {
			sum += parseDoub(i);
		}
		return (sum / numbers.length);
	}

	public static void infoPrinter(String[] nome, String[] money, double media) {
		int count = 0;
		for (String i : money) {
			if (parseDoub(i) < media) {
				System.out.println(nome[count]);
			}
			count++;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[][] matrizComida = arrayFactory(in);
		String[] nomes = matrizComida[0];
		String[] dinheiros = matrizComida[1];
		double guitoMediano = media(dinheiros);
		System.out.println(guitoMediano);
		infoPrinter(nomes, dinheiros, guitoMediano);
	}

	public static double rounder(double n, int order) {
		int temp = (int) (n * Math.pow(10, order + 1));
		if (temp % 10 >= 5) {
			temp += 1;
		}
		return (temp / Math.pow(10.0, order + 1));
	}

	private static String[][] condenser(String[] nome, String[] capital, int len) {
		String[][] nani = new String[2][len];
		for (int i = 0; i < len; i++) {
			nani[0][i] = nome[i];
			nani[1][i] = capital[i];
		}
		return nani;
	}
}

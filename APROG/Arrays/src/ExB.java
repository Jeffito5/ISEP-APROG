package Arrays.src;

import java.util.Scanner;

public class ExB {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i = 0, num, numMenor, ocorrencias = 0, a, b = 0;
		int[] sequencia = new int[60];

		num = ler.nextInt();
		numMenor = num;
		if (num >= 0) {
			while (num >= 0) {
				if (num < numMenor) {
					numMenor = num;
				}
				sequencia[i] = num;
				i++;
				b++;
				num = ler.nextInt();
			}
			for (a = 0; a <= (b - 1); a++) {
				if (sequencia[a] == numMenor) {
					ocorrencias++;
				}
			}
			System.out.println("menor=" + numMenor);
			System.out.println("ocorrencias=" + ocorrencias);
		}
	}
}

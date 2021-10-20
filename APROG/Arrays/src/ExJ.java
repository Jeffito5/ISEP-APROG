package Arrays.src;

import java.util.Scanner;

public class ExJ {

	public static String[][] CriarEGuardarArrayDeEmpregados(Scanner scanner) {
		String[][] empregados = new String[200][2];
		String nomeEmpregado = scanner.nextLine();
		int iteracao = 0;

		while (!nomeEmpregado.equals("FIM")) {
			String salarioEmpregado = scanner.nextLine();
			empregados[iteracao] = new String[]{nomeEmpregado, salarioEmpregado};
			nomeEmpregado = scanner.nextLine();
			iteracao++;
		}

		return empregados;
	}
	public static int calcularNumeroDeEmpregados(String[][] empregados) {
		int numeroDeEmpregados = 0;

		for (int i = 0; i < empregados.length; i++) {
			if (empregados[i][0] != null) {
				numeroDeEmpregados++;
			}
		}
		return numeroDeEmpregados;
	}
	public static String[][] ordenarEmpregados(String[][] employees,
			int numeroDeEmpregados) {
		String[][] empregadosOrdenados = employees;

		for (int i = 0; i < numeroDeEmpregados - 1; i++) {
			for (int j = i + 1; j < numeroDeEmpregados; j++) {

				String nomeEmpregado1 = empregadosOrdenados[i][0];
				String nomeEmpregado2 = empregadosOrdenados[j][0];

				double salarioEmpregado1
						= Double.parseDouble(empregadosOrdenados[i][1]);
				double salarioEmpregado2
						= Double.parseDouble(empregadosOrdenados[j][1]);

				if (salarioEmpregado1 < salarioEmpregado2
						|| (salarioEmpregado1 == salarioEmpregado2
						&& nomeEmpregado1.compareTo(nomeEmpregado2) > 0)) {
					String[] fixadorDeLugar = empregadosOrdenados[i];
					empregadosOrdenados[i] = empregadosOrdenados[j];
					empregadosOrdenados[j] = fixadorDeLugar;
				}
			}
		}
		return empregadosOrdenados;
	}
	public static String[][] verificarTresMaisBemPagos(String[][] empregados,
			int numeroDeEmpregados) {
		String[][] tresMaisBemPagos = new String[3][2];
		String[][] empregadosOrdenados = ordenarEmpregados(empregados,
				numeroDeEmpregados);

		for (int i = 0; i < 3; i++) {
			tresMaisBemPagos[i] = empregadosOrdenados[i];
		}

		return tresMaisBemPagos;
	}
	public static void imprimirFormatadamenteEmpregados(String[][] empregados) {
		for (int i = 0; i < empregados.length; i++) {
			if (empregados[i][0] != null) {
				int posicao = i + 1;
				String nomeEmpregado = empregados[i][0];
				String salarioEmpregado = empregados[i][1];

				System.out.println(
						"#" + posicao + ":" + nomeEmpregado + ":" + salarioEmpregado
				);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] empregados = CriarEGuardarArrayDeEmpregados(scanner);
		int numeroDeEmpregados = calcularNumeroDeEmpregados(empregados);

		if (numeroDeEmpregados > 0) {
			String[][] tresMaisBemPagos
					= verificarTresMaisBemPagos(empregados, numeroDeEmpregados);

			imprimirFormatadamenteEmpregados(tresMaisBemPagos);
		}
	}
}

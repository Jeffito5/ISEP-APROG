package Arrays.src;

import java.util.Scanner;

public class ExF {

	static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        float[] taxas = lerTaxas();
        int deposito = ler.nextInt();
        System.out.printf("valor final=%.2f\n", calculaFinal(taxas, deposito));
    }
    public static float[] lerTaxas() {
        float[] taxas = new float[6];
        for (int i = 0; i < 6; i++) {
            taxas[i] = ler.nextFloat();
        }
        return taxas;
    }
    public static float calculaFinal(float[] taxas, int deposito) {
        float montanteFinal = deposito;
        for (int i = 0; i < 6; i++) {
            montanteFinal += montanteFinal * taxas[i];
        }
        return montanteFinal;
    }
}

package Essencial;
import java.util.Scanner;
public class ExL {
    public static void main(String[] args) {
        int contNumPerfeitos = 0;
        int num,numPerf;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        numPerf = ler.nextInt();
            for (int i = 1; i < num; i++) { /* começo a ver quem é número perfeito a partir do 1 */
                while (num != contNumPerfeitos){
                    for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                            System.out.println(j);
                            contNumPerfeitos++;
                        }
                    }
                }
            }
    }
}
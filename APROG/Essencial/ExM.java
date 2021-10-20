package Essencial;
import java.util.Scanner;
public class ExM {
    public static void main(String[] args) {
        int num, n1, n2, i, temp;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        n1 = 0;
        n2 = 1;
        if (num > 0) {
            switch (num) {
                case 1:
                    System.out.println(n1);
                    break;
                case 2:
                    System.out.println(n1);
                    System.out.println(n2);
                    break;
                default:
                    System.out.println(n1);
                    System.out.println(n2);
                    temp = 1;

                    for (i = 3; i < num + 1; i++) {
                        n1 = n1 + n2;
                        n2 = temp;
                        temp = n1;
                        System.out.println(n1);

                    }

            }

        }

    }
}

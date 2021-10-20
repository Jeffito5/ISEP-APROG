package Modularização;
import java.util.Scanner;
public class ExI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if (fibonacci(n)) {
            System.out.println("e de Fibonacci");

        } else {
            System.out.println("nao e de Fibonacci");
        }

    }

    public static boolean fibonacci(int n) {
        boolean caso = false;
        int num1 = 0, num2 = 1, aux;
        switch (n) {
            case 0:
                caso = true;
                break;
            default:
                for (int i = 0; i <= n; i++) {
                    aux = num2;
                    num2 = num1 + num2;
                    num1 = aux;
                    if (n == num1) {
                        caso = true;
                    }
                }
        }
        return caso;
    }
}

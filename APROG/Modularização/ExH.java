package Modularização;
import java.util.Scanner;
public class ExH {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int tentativas = 0;
        boolean flag;
        do {
            flag = true;
            int num = Integer.parseInt(sc.nextLine());

            if (num != isCapicua(num)) {
                flag = false;
            }
            tentativas++;
        } while (tentativas < 5 && !flag);
        if (flag) {
            System.out.println("capicua");
        } else {
            System.out.println("tentativas excedidas");
        }
    }

    public static int isCapicua(int n) {
        int capicua = 0;

        while (n > 0) {
            int digit = n % 10;
            capicua = capicua * 10 + digit;
            n /= 10;
        }
        return capicua;
    }
}

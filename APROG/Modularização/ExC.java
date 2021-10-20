package Modularização;
import java.util.Scanner;
public class ExC {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();
        if ((a > 0 && b > 0 && c > 0) && (a < b + c && b < a + c && c < a + b)) {
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            System.out.println("c=" + c);

            System.out.println("ang(a,b)=" + calcAng(a, b, c));
            System.out.println("ang(a,c)=" + calcAng(a, c, b));
            System.out.println("ang(b,c)=" + calcAng(b, c, a));
        } else {
            System.out.println("impossivel");
        }

    }

    public static int calcAng(int lado1, int lado2, int lado3) {
        int res;
        res = (int) Math.toDegrees(Math.acos((Math.pow(lado1, 2) + Math.pow(lado2, 2) - Math.pow(lado3,2)) / (2 * lado1 * lado2)));
        return res;
    }
}

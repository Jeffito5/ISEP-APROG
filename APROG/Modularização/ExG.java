package Modularização;
import java.util.Scanner;
public class ExG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lim = in.nextInt();

        int i = 0;
        while (i <= lim) {
            if (armstrong(i)) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static int digits(int num) {
        int count = 0;
        if (num == 0) {
            count++;
        }
        while (num != 0) {
            count++;
            num /= 10;

        }
        return count;
    }

    public static boolean armstrong(int num) {
        int exponent = digits(num);
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            sum += Math.pow(temp % 10, exponent);
            temp /= 10;
        }
        return num == sum;
    }

}

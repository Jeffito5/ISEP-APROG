package Modularização;
import java.util.Scanner;
import java.lang.Math;
public class ExF {
    public static double rounder(double num, int ordem) {
            int temp = 0;
            num *= Math.pow(10, ordem + 1);
            temp = (int) num;
            if (temp % 10 > 4) {
                temp += 10;
            }
            num = (double) temp;
            num /= Math.pow(10, 1);
            temp = (int) num;
            num = (double) temp;

            return num;

        }

        public static double volume(String str, double radius, double height) {
            int addZero = 0;
            double pi = 3.141592653589793;
            if (str.equals("cone")) {
                return rounder(((1.0 / 3) * pi * radius * radius * height), 2);
            }
            if (str.equals("cilindro")) {
                return rounder((pi * radius * radius * height), 2);
            }
            if (str.equals("esfera")) {
                return rounder(((4 / 3.0) * pi * radius * radius * radius), 2);
            }
            return -1;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String solido = in.nextLine();
            while (!(solido.equals("fim"))) {
                double raio = Double.parseDouble(in.nextLine());
                if (solido.equals("cilindro") || solido.equals("cone")) {
                    double altura = Double.parseDouble(in.nextLine());
                    double resultado = volume(solido, raio, altura);
                    if (resultado % 10 == 0) {
                        System.out.println(resultado / 100 + "0");
                    } else {
                        System.out.println(resultado / 100);
                    }
                }
                if (solido.equals("esfera")) {
                    double resultado;
                    resultado = volume(solido, raio, 0);
                    if (resultado % 10 == 0) {
                        System.out.println(resultado / 100 + "0");
                    } else {
                        System.out.println(resultado / 100);
                    }
                }
                solido = in.nextLine();
            }
        }
}

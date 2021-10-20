package Essencial;
import java.util.Scanner;
public class ExZ {
    public static void main(String[] args) {
        int num, alg, contPares=0, contAlg=0, result,maior=0;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        while(num>0){
            alg = num % 10;
            contAlg++;
            if(alg % 2 ==0){
                contPares++;
            }
            num = num / 10;
        }
        result=contPares/contAlg;
        System.out.printf("% .2f %n"+ result);
        while(num>0){
            alg = num % 10;
            if(alg % 2 !=0){
                maior = Math.max(alg, maior);
            }
        }
    }
}

package Modularização;
import java.util.Scanner;
public class ExX {
    static Scanner ler= new Scanner(System.in);
    static int K=5;
    public static void main(String[] args) {
        int media=0;
        media=calculaMedia();
        System.out.println(media);
    }
    public static int calculaMedia(){
        int algarismos, num, i=0, contDig, contNum=0,result=0;
        algarismos=ler.nextInt();
        while(i<K){
            num=ler.nextInt();
            contDig=contaDigitos(num);
            if(algarismos<contDig){
                result+=num;
                contNum++;
            }
            i++;
        }
        result=result/contNum;
        return result;
    }
    public static int contaDigitos(int numero){
        int cont=0;
        if (numero == 0) cont = 1;
        else
            while (numero != 0){
                cont = cont + 1;
                numero = numero / 10;
            }
            return cont;
    }
}

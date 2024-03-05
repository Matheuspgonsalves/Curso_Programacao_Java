package M5_Exercicios_condicional;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        //variaveis 
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        sc.close();
    }
}

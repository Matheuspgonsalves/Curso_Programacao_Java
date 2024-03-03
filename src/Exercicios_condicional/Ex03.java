package Exercicios_condicional;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        //variaveis
        Scanner sc = new Scanner(System.in);
        int A, B, aux;

        //entrada do usuario
        System.out.println("Digite um numero: ");
        A = sc.nextInt();
        System.out.println("Digite outro numero: ");
        B = sc.nextInt();

        //condicao para colocar em order crescente
        if(A < B){
            aux = A;
            A = B;
            B = aux;
        }

        //condicao para verificar se eh multiplo
        if(A % B == 0){
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }
        sc.close();
    }
}

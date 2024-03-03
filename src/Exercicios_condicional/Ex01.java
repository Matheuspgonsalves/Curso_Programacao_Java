package Exercicios_condicional;
import java.util.Scanner;

public class Ex01{
    public static void main(String[] args){
        //variaveis e scanner
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if(num >= 0){
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }
    }
}
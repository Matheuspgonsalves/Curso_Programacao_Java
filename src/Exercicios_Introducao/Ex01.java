package Exercicios_Introducao;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//variaveis
		int n1, n2, sum;
		Scanner sc = new Scanner(System.in);//entrada de dados
		
		//Recebe entrada do usuario
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextInt();
		
		//operacao
		sum = n1+n2;
		
		//saida de dados
		System.out.printf("A soma de %d + %d = %d", n1, n2, sum);
		
		
		sc.close();
	}
}

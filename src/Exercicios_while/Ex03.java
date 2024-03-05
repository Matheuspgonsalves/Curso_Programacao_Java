package Exercicios_while;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alcool = 0, gasolina = 0, diesel = 0;
		int opcao;
		
		System.out.println("\n1.Alcool \n2.Gasolina; \n3.Diesel\n4.Fim\nInforme o combustivel abastecido: ");
		opcao = sc.nextInt();
		
		while(opcao != 4) {
			switch(opcao) {
				case 1:
					alcool =+ 1;
					opcao = sc.nextInt();
					break;
				case 2:
					gasolina += 1;
					opcao = sc.nextInt();
					break;
				case 3:
					diesel += 1;
					opcao = sc.nextInt();
					break;
				case 4:
					System.out.println("Muito obrigado");
					break;
				default:
					System.out.println("Digite um codigo valido: ");
					opcao = sc.nextInt();
					break;
			}
		}
		
		System.out.println("Alcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);
		sc.close();
	}
}

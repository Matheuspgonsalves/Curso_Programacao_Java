package Exercicios_Introducao;
import java.util.Scanner;
import java.util.Locale;

public class Ex05 {
	public static void main(String[] args) {
		//locale
		Locale.setDefault(Locale.US);
		//Scanner e variaveis
		Scanner sc = new Scanner(System.in);
		int codigoP1, numeroP1, codigoP2, numeroP2;
		double valorUnitarioP1, valorUnitarioP2;
		
		//entrada do usuario
		System.out.println("Digite o codigo, numero e valor da(s) peça(s) 1: ");
		codigoP1 = sc.nextInt();
		numeroP1 = sc.nextInt();
		valorUnitarioP1 = sc.nextDouble();
		
		System.out.println("Digite o codigo, numero e valor da(s) peça(s) 2: ");
		codigoP2 = sc.nextInt();
		numeroP2 = sc.nextInt();
		valorUnitarioP2 = sc.nextDouble();
		
		//saida para usuario + operacao
		System.out.printf("Valor a pagar: R$ %.2f", ( (double)(numeroP1 * valorUnitarioP1)+(numeroP2 * valorUnitarioP2) ));
		
		
		sc.close();
	}
}

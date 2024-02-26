package Exercicios_Introducao;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//Scanner e variaveis
		Scanner sc = new Scanner(System.in);
		int a,b,c,d, dif;
		
		//entrada do usuario
		System.out.println("Digite os valores de A,B,C,D nessa ordem: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		//operacao
		dif = ((a*b)-(c*d));
		
		//saida para usuario
		System.out.println("Diferença = "+dif);
		
		
		sc.close();
	}
}

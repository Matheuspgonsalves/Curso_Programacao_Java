package Exercicios_Introducao;
import java.util.Scanner;
import java.util.Locale;

public class Ex04 {
	public static void main(String[] args) {
		//locale
		Locale.setDefault(Locale.US);
		//Scanner e variaveis
		Scanner sc = new Scanner(System.in);
		int number, hourWorked;
		double salary, calculo;
		
		//entrada do usuario
		System.out.println("Digite seu numero: ");
		number = sc.nextInt();
		System.out.println("Informe as horas workadas: ");
		hourWorked = sc.nextInt();
		System.out.println("Informa pro pai your salary per hour: ");
		salary = sc.nextDouble();
		
		//operacao
		calculo = (double) hourWorked * salary;
		
		//saida para usuario
		System.out.println("NUMBER: "+number);
		System.out.printf("SALARY: %.2f", calculo);
		
		sc.close();
	}
}

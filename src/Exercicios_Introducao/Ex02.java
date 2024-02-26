package Exercicios_Introducao;
import java.util.Scanner;
import java.util.Locale;

public class Ex02 {
	public static void main(String[] args) {
		//locale
		Locale.setDefault(Locale.US);
		//variaveis
		double pi = 3.14159, raio, area;
		Scanner sc = new Scanner(System.in);
		
		//entrada do usuario
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		//operacao matematica
		area = pi * Math.pow(raio, 2f);
		
		//saida para usuario
		System.out.printf("A area do circulo é: %.4f", area);
		
		sc.close();
	}
}

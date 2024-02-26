package HelloWorld;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int x = 32;
		double y = 10.23804;
		
		System.out.println(x);
		System.out.println(y);
		System.out.printf("%.2f%n", y);
		System.out.printf("%.4f%n", y);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", y);
		System.out.println("Resultado = "+x+ " metros");
		System.out.printf("Resultado = %d metros\n\n", x);
		System.out.println("=====================================================\n\n");
		
		int idade = 31;
		String nome = "Maria";
		double renda = 4340.23;
		
		System.out.printf("%s tem %d anos e ganha %.2f reais\n", nome, idade, renda);
		
	}

}

package entrada_de_dados;
import java.util.Scanner;

public class EntradaInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println("Você digitou: " + x);
		
		sc.close();
	}
}

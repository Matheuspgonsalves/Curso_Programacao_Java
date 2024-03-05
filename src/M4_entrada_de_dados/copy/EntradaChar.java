package M4_entrada_de_dados.copy;
import java.util.*;

public class EntradaChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x;
		
		x = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
		
		sc.close();
	}
}

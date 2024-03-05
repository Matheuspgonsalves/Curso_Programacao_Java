package M4_entrada_de_dados.copy;
import java.util.*;

public class EntradaVariosDados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y =  sc.nextInt();
		z = sc.nextDouble();
		
		System.out.printf("Você digitou: %s, %d e %.2f", x, y, z);
		sc.close();
	}
}

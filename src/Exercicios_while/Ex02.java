package Exercicios_while;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.println("Digite as coordenadas x e y: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while( (x != 0) && (y != 0) ) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if(x < 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if(x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}
}

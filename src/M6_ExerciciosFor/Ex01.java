package M6_ExerciciosFor;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		do {
			System.out.println("Digite um valor entre 1 e 1000");
			x = sc.nextInt();
		}while(x < 1 || x > 1000);
		
		for(int i = 0; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}

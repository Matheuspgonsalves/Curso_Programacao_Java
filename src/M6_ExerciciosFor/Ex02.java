package M6_ExerciciosFor;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, x, in = 0, out = 0;
		
		System.out.println("Digite a quantidade de leituras");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println("In: " + in + "\nOut: " + out);
		
		sc.close();
	}
}

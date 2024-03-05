package M6_ExerciciosFor;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double media = 0, num1, num2, num3;
		
		System.out.println("Numero de casos de testes: ");
		n = sc.nextInt();		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite as notas");
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			num3 = sc.nextDouble();
			
			media = (double)(2*num1 + 3*num2 + 5*num3)/(5 + 3 + 2);
			System.out.println(media);
		}
		
		sc.close();
	}
}

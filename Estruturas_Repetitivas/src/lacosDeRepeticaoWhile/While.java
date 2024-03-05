package lacosDeRepeticaoWhile;
import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int num = 0;
		
		//recebe valor do teclado
		
		num = sc.nextInt();
		while(num != 0) {//somar os valores recebidos para "num"
			soma += num;
			num = sc.nextInt();
		}
		System.out.println(soma);
		sc.close();
	}
}

package lacosDeRepeticaoWhile;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha = 2002, informeSenha;
		
		System.out.println("Digite sua senha: ");
		informeSenha = sc.nextInt();
		
		while(informeSenha != senha) {
			System.out.println("Senha inválida.Tente novamente: ");
			informeSenha = sc.nextInt();
		}
		System.out.println("Acesso permitido");
		
		sc.close();
	}
}

package M5_Exercicios_condicional;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        //variaveis 
        Scanner sc = new Scanner(System.in);
        double codigo1 = 4f, codigo2 = 4.5, codigo3 = 5, codigo4 = 2, codigo5 = 1.5, total = 0;
        int x, qtd;

        //entrada do codigo
        System.out.println("Digite o codigo do item desejado: ");
        x = sc.nextInt();
        System.out.println("Digite a quantidade desejada: ");
        qtd = sc.nextInt();

        //condicoes para calcular preco
        if(x == 1){
            total = (double) qtd * codigo1;
        } else if (x == 2) {
            total = (double) qtd * codigo2;
        } else if (x == 3) {
            total = (double) qtd * codigo3;
        } else if (x == 4) {
            total = (double) qtd * codigo4;
        } else if (x == 5) {
            total = (double) qtd * codigo5;
        }

        //mostrando total
        System.out.printf("O total e: %.2f\n", total);

        sc.close();
    }
}

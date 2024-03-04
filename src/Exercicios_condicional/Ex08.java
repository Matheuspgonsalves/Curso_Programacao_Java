package Exercicios_condicional;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        //variaveis
        Scanner sc = new Scanner(System.in);//variavel para leitura do teclado
        double renda, imposto = 0;

        //entrada da renda
        System.out.println("Digite sua renda: ");//mensagem para usuario
        renda = sc.nextDouble();

        //start if
        if(renda >= 0 && renda <= 2000){//isencao de imposto
            System.out.println("Isento");
        } 
        else if(renda > 2000 && renda <= 3000){//imposto de 8%
            imposto = (renda - 2000) * 0.08;
            System.out.printf("Imposto a ser pago: %.2f\n", imposto);
        } 
        else if (renda > 3000 && renda <= 4500){//imposto de 18%
            //o imposto de 18% é calculado apenas para valores acima de 3000
            double restante = renda - 3000;
            imposto = (((1000) * 0.08) + (restante * 0.18));//aplicacoes de imposto de 8% sobre 1000 e 18% sobre o restante
            System.out.printf("Imposto a ser pago: %.2f\n" ,imposto);
        } 
        else if (renda > 4500) {//imposto de 28%
            double restante = renda - 4500;//o imposto de 28% sera calculado apenas no restante
            imposto = (( (1000) * 0.08) + ((1500) * 0.18) + (restante * 0.28));
            System.out.printf("Imposto a ser pago: %.2f\n", imposto);
        }
        //end if

        sc.close();
    }
}

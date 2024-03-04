package Exercicios_condicional;
import java.util.Scanner;
import java.util.Locale;

public class Ex07 {
    public static void main(String[] args) {
        //variaveis
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor1, valor2;

        //entradas das coordenadas
        System.out.println("Digite coordenada x: ");
        valor1 = sc.nextDouble();
        System.out.println("Digite coordenada y: ");
        valor2 = sc.nextDouble();

        //condicoes das coordenadas
        if(valor1 > 0 && valor2 > 0){
            System.out.println("Quadrante Q1");
        } else if (valor1 < 0 && valor2 > 0){
            System.out.println("Quadrante Q2");
        } else if(valor1 < 0 && valor2 < 0){
            System.out.println("Quadrante Q3");
        } else if(valor1 > 0 && valor2 < 0) {
            System.out.println("Quadrante Q4");
        } else if (valor1 == 0 && valor2 == 0){
            System.out.println("ORIGEM");
        }

        sc.close();
    }
}

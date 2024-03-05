package M5_Exercicios_condicional;
import java.util.Scanner;
import java.util.Locale;

public class Ex06 {
    public static void main(String[] args) {
        //variaveis
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valorIntervalo;

        //entrada para o valor do intervalo
        System.out.println("Digite o valor do intervalo: ");
        valorIntervalo = sc.nextDouble();

        //condicao
        if(valorIntervalo >= 0 && valorIntervalo <= 25){
            System.out.println("Intervalo [0, 25]");
        } else if(valorIntervalo > 25 && valorIntervalo <= 50){
            System.out.println("Intervalo [26, 50]");
        } else if(valorIntervalo > 50 && valorIntervalo <= 75){
            System.out.println("Intervalo [51, 75]");
        } else if(valorIntervalo > 75 && valorIntervalo <= 100) {
            System.out.println("Intervalo [76, 100]");
        }
        sc.close();
    }
}

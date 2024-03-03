package Exercicios_condicional;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        //variaveis
        Scanner sc = new Scanner(System.in);
        int horaInicio, horaFim, duracao;

        //leitura das horas
        System.out.println("Hora inicial: ");
        horaInicio = sc.nextInt();
        System.out.println("Hora final: ");
        horaFim = sc.nextInt();

        if(horaInicio < horaFim){
            duracao = horaFim - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.println("O jogo durou "+duracao+" horas");

        sc.close();

    }
}

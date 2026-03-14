//Nome: Frederico Kiyoshi
//Matrícula: 1261938754

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double distancia, velocidade, tempoHoras;
        int horas, minutos;

        System.out.print("Distancia (km): ");
        distancia = scanner.nextDouble();

        System.out.print("Velocidade média (km/h): ");
        velocidade = scanner.nextDouble();

        tempoHoras = distancia / velocidade;

        horas = (int) tempoHoras; 
        minutos = (int) ((tempoHoras - horas) * 60);

        System.out.println("Tempo estimado: " + horas + " horas e " + minutos + " minutos");


    }
}

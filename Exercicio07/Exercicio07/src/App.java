//Nome: Frederico Kiyoshi
//Matrícula: 1261938754

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double distancia, combustivel, consumoMedio;

        System.out.println("Distancia percorrida (km): ");
        distancia = scanner.nextDouble();

        System.out.println("combustível gasto (litros): ");
        combustivel = scanner.nextDouble();

        consumoMedio = distancia / combustivel;

        System.out.println("Consumo medio: " + consumoMedio + " km/1");

    }
}

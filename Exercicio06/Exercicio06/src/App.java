// Nome: Frederico Kiyoshi
// Matrícula: 1261938754

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Digite a base (em cm): ");
        base = scanner.nextDouble();

        System.out.println("Digite a altura (em cm): ");
        altura = scanner.nextDouble();

        area = base * altura;

        System.out.printf("Área do retângulo: " + area + " cm² ");


    }
}

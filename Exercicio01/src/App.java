// Nome: Frederico Kiyoshi
// Matrícula: 1261938754

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        double adicao = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;
      
        System.out.println("adicao: " + adicao);
        System.out.println("subtracao: " + subtracao);
        System.out.println("multiplicacao: " + multiplicacao);
        System.out.println("divisao: " + divisao);
        
    }
}

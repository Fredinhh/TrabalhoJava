// Nome: Frederico Kiyoshi
// Matrícula: 1261938754

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Digite a nota 1: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2: ");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3: ");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("%.2f", media);

        
    }
}

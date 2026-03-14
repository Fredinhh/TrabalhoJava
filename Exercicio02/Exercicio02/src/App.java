// Nome: Frederico Kiyoshi
// Matrícula: 1261938754


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite x: ");
        int x = scanner.nextInt();

        System.out.println("digite y: ");
        int y = scanner.nextInt();

        int resto = x % y;
        System.out.println("o resto da divisao de " + x + " por " + y + " é: " + resto);
       

    }
}

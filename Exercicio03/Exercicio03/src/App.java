import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
     
        final double COTACAO = 4.95;

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor em dólar: ");
        double valorDolar = scanner.nextDouble();

        
        double valorReal = valorDolar * COTACAO;

        
        System.out.printf("Valor convertido: %.2f R$ ", valorReal);

    }
}
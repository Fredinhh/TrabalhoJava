//Nome: Frederico Kiyoshi
//Matrícula: 1261938754

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
      Scanner scanner = new Scanner(System.in);

      double preco, valorPago, troco;

      System.out.println("Preço do produto: ");
      preco = scanner.nextDouble();

      System.out.println("Valor pago: ");
      valorPago = scanner.nextDouble();

      troco = valorPago - preco;

      System.out.printf("Troco: R$ %.2f\n", troco);

    }
}
 
// Nome: Frederico Kiyoshi
// Matrícula: 1261938754

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("R$ #,##0.00");

        System.out.println("digite o salario atual: ");
        double salario = scanner.nextDouble();       

        double novoSalario = salario * 1.07;

        System.out.println("salario original: " + formato.format(salario));
        System.out.println("novo salario: " + formato.format(novoSalario));

        scanner.close();
    }
}

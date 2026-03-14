//Nome: Fredderico Kiyoshi
//Matrícula: 1261938754

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double celsius, fahrenheit, kelvin;

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;
        kelvin = celsius + 273.15;

        System.out.println("Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Kelvin " + kelvin + " K");
        
    }
}

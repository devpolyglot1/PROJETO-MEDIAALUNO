import java.util.Scanner;


public class Pratica2 {
    public static void main(String[] args) {



        System.out.println("Digite a temperatura em Celsius para Fahrenheit");
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        double convertido = fahrenheit;

        System.out.println("A Temperatura: " + celsius + "Convertida é equivalente a " + fahrenheit + "°F");

        System.out.println("-------------------");

        System.out.println("Digite a temperatura em Celsius para Kelvin");

        double celsius2 = input.nextDouble();

        double Kelvin = celsius2 + 273.15;

        double convertido2 = Kelvin;

        System.out.println("A temperatura de Celsius para Kelvin é equivalente a: " + convertido2);




    }
}

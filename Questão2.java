import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperaturaCelsius, temperaturaFahrenheit, temperaturaKelvin;

        System.out.print("Digite a temperatura em Celsius: ");
        temperaturaCelsius = scanner.nextDouble();

        temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;
        temperaturaKelvin = temperaturaCelsius + 273.15;

        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);
        System.out.println("Temperatura em Kelvin: " + temperaturaKelvin);

        scanner.close();
    }
}

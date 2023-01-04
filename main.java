import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter a temperature value and scale (Celsius, Fahrenheit, or Kelvin)
        System.out.print("Enter a temperature value: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine(); // consume the remaining newline character
        System.out.print("Enter the scale (C, F, or K): ");
        String scale = scanner.nextLine();
        scale = scale.toUpperCase();

        // convert the temperature to the target scales
        double celsius = 0.0;
        double fahrenheit = 0.0;
        double kelvin = 0.0;
        if (scale.equals("C")) {
            celsius = temperature;
            fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
            kelvin = celsius + 273.15;
        } else if (scale.equals("F")) {
            fahrenheit = temperature;
            celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
            kelvin = celsius + 273.15;
        } else if (scale.equals("K")) {
            kelvin = temperature;
            celsius = kelvin - 273.15;
            fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        } else {
            System.out.println("Invalid scale.");
            return;
        }

        // print the converted temperatures
        System.out.println(temperature + scale + " is equivalent to:");
        System.out.println(celsius + "C");
        System.out.println(fahrenheit + "F");
        System.out.println(kelvin + "K");
    }
}

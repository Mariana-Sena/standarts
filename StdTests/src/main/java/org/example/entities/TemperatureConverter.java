package org.example.entities;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter a temperature in Celsius: ");

        try {
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        } catch (Exception e) {
            System.err.println("Error: Please, enter a valid numeric value.");
        } finally {
            scanner.close();
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

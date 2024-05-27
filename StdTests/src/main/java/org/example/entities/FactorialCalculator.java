package org.example.entities;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Factorial Calculator");
        System.out.print("Enter a non-negative integer: ");

        try {
            int number = scanner.nextInt();

            if (number < 0) {
                throw new IllegalArgumentException("The number must be non-negative.");
            }

            long factorial = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + factorial);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: Please, type a valid numeric value.");
        } finally {
            scanner.close();
        }
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}


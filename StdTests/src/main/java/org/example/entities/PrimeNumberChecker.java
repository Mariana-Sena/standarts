package org.example.entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prime number check");
        System.out.print("Type a positive integer: ");

        try {
            int number = scanner.nextInt();

            if (number < 0) {
                throw new InputMismatchException("The number must be positive.");
            }

            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        } catch (InputMismatchException e) {
            System.err.println("Error: Please, enter a valid positive integer.");
        } finally {
            scanner.close();
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

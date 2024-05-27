package org.example.entities;

import java.util.Scanner;

public class VoterEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Checking eligibility to vote");
        System.out.print("Type your name: ");
        String name = scanner.nextLine();

        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Type your age: ");
            String inputAge = scanner.nextLine();

            try {
                age = Integer.parseInt(inputAge);
                validAge = true;
            } catch (NumberFormatException e) {
                System.err.println("Error: Please, type a valid age.");
            }
        }

        if (age >= 18) {
            System.out.println(name + ", you are eligible to vote!");
        } else {
            System.out.println(name + ", you are not eligible to vote yet.");
        }

        scanner.close();
    }
}


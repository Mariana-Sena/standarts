package org.example.entities;

import java.util.Scanner;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students would like to calculate the average? ");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("\nStudent " + i + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            double grade1 = readGrade(scanner, "Grade 1");
            double grade2 = readGrade(scanner, "Grade 2");

            double average = calculateAverage(grade1, grade2);
            System.out.println("Average for " + name + ": " + average);
        }

        scanner.close();
    }

    private static double readGrade(Scanner scanner, String gradeName) {
        double grade;
        while (true) {
            System.out.print(gradeName + ": ");
            try {
                grade = Double.parseDouble(scanner.nextLine().replace(",", "."));
                if (grade < 0 || grade > 10) {
                    throw new IllegalArgumentException("Grade must be between 0 and 10.");
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Error: Invalid input. Please enter a number.");
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        return grade;
    }

    private static double calculateAverage(double grade1, double grade2) {
        return (grade1 + grade2) / 2.0;
    }
}



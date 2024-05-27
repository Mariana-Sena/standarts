package org.example.entities;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManipulationExample {
    private static final String FILENAME = "arquivo.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira linhas para adicionar ao arquivo
        System.out.println("Type the lines you want to add to the file (Type 'end' to stop):");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
            while (true) {
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("end")) {
                    break;
                }
                writer.write(line);
                writer.newLine();
                writer.flush();
            }
            System.out.println("Lines have been added to the file successfully!");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Ler e exibir o conteúdo do arquivo
        System.out.println("File contents:");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading to file: " + e.getMessage());
        }

        scanner.close();
    }
}

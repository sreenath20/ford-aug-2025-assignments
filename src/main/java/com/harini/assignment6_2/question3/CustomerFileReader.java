package com.harini.assignment6_2.question3;

import java.io.*;

public class CustomerFileReader {
    public static void main(String[] args) {
        String fileName = "src/main/resources/customers.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                try {
                    String[] parts = line.split(",");
                    String name = parts[0];
                    double balance = Double.parseDouble(parts[1]);
                    System.out.println(name + " has balance: " + balance);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid balance format in line: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

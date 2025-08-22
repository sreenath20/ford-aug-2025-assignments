package com.ford.assignment6;

import java.io.*;

public class CustomerFileReader {

    public static void main(String[] args) {
        String fileName = "customer.txt";


        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length != 2) {
                    System.out.println("Invalid line format: " + line);
                    continue;
                }

                String name = parts[0].trim();
                String balanceStr = parts[1].trim();

                try {
                    double balance = Double.parseDouble(balanceStr);
                    System.out.println("Customer: " + name + ", Balance: $" + balance);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid balance for " + name + ": " + balanceStr);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

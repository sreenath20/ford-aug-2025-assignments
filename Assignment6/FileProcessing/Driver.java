package Assignment6.FileProcessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileReader;


public class Driver {
        public static void main(String[] args) {
            File file = new File("customers.txt");

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    String name = parts[0].trim();

                    try {
                        double balance = Double.parseDouble(parts[1].trim());
                        System.out.println("Customer: " + name + ", Balance: " + balance);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid balance for customer: " + name);
                    }
                }

            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
            } catch (IOException e) {
                System.out.println("Error reading file.");
            }
        }


}



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomerFileReader {
    public static void main(String[] args) {
        String filename = args.length > 0 ? args[0] : "customers.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNum = 0;
            while ((line = br.readLine()) != null) {
                lineNum++;
                line = line.trim();
                if (line.isEmpty()) {
                    // skip blank lines
                    continue;
                }

                String[] parts = line.split(",", 2);
                if (parts.length < 2) {
                    System.err.printf("Line %d malformed (expected 'name,balance'): '%s'%n", lineNum, line);
                    continue;
                }

                String name = parts[0].trim();
                String balanceText = parts[1].trim();

                try {
                    double balance = Double.parseDouble(balanceText);
                    System.out.printf("Customer: %-10s Balance: %.2f%n", name, balance);
                } catch (NumberFormatException nfe) {
                    System.err.printf("Line %d: invalid balance for '%s': '%s'%n", lineNum, name, balanceText);
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.err.printf("File not found: %s%n", filename);
        } catch (IOException ioe) {
            System.err.printf("I/O error while reading file %s: %s%n", filename, ioe.getMessage());
        }
    }
}

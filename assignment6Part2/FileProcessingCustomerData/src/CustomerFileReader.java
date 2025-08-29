import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CustomerFileReader {

    public void readCustomerFile(String fileName) throws IOException {
        BufferedReader reader =null;
        try{
            //To open the file, we use FileReader and give file name in the arguments
            FileReader fileReader = new FileReader(fileName);
            //wrap in the bufferedReader
            reader = new BufferedReader(fileReader);

            //with this we can read lines using reader.readLine() method
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String[] parts = line.split(",");
                    System.out.println(Arrays.toString(parts));
                    if (parts.length != 2) {
                        throw new IllegalArgumentException("Invalid line format: " + line);
                    }

                    String name = parts[0];
                    double balance = Double.parseDouble(parts[1]);  // May throw NumberFormatException

                    System.out.println(name + " has a balance of " + balance);

                } catch (NumberFormatException e) {
                    System.out.println("Invalid balance for line: " + line);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        finally {
            reader.close();
        }
    }
    }




package com.assignments.assignment6_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CustomerFileReader {

    public void readCustomerFile(String fileName) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        String line;
        while((line = bufferedReader.readLine()) != null){
            String[] strArr = line.split(",");
            String customerName = strArr[0];
            int quantity = Integer.parseInt(strArr[1]);
            System.out.println("Customer Name: "+customerName+" Quantity: "+quantity);
        }


    }

}

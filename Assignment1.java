package com.assignments;

import java.util.Scanner;

public class Assignment1 {
    Scanner sc = new Scanner(System.in);

    public void EMICalculator() {
        System.out.println("-----------------------EMI Calculator-----------------------");
        System.out.print("Enter Principle Amount : ");
        double principeAmount = sc.nextDouble();
        System.out.print("Enter interest rate %  : ");
        float interestRate = sc.nextFloat();
        System.out.print("Enter Tenure period (in years) : ");
        int tenurePeriod = sc.nextInt();

        double powerFactor = Math.pow(1 + interestRate / 100, tenurePeriod);
        Double numerator = principeAmount * interestRate / 100 * powerFactor;
        Double denominator = powerFactor - 1;
        Double emi = numerator / denominator;
        System.out.printf("EMI :₹ %.2f%n \n ", emi);

    }

    public void IoTDataNormalization() {

        try {
            System.out.print("Enter IoT Sensor Data : ");
            short parsedData = sc.nextShort();
            System.out.println("Binary form of data : " + Integer.toBinaryString(parsedData));

            int motionMask = 1 << 7;
            int lightMask = 1 << 6;
            int temperatureMask = 1 << 5;
            int smokeMask = 1 << 4;

            boolean motionDetected = (parsedData & motionMask) != 0;
            boolean lightOn = (parsedData & lightMask) != 0;
            Boolean smokeDetected = (parsedData & smokeMask) != 0;
            Boolean highTemperature = (parsedData & temperatureMask) != 0;

            if (motionDetected && !lightOn)
                System.out.println("Turn On the light");
            else if (!motionDetected && lightOn)
                System.out.println("No motion detected ,Turn Off the light");
            if (smokeDetected && highTemperature)
                System.out.println("High Temperature & Smoke Detected !!!");
            else if (highTemperature)
                System.out.println("High Temperature detected !!! Check the cooling system.");
            else if (smokeDetected)
                System.out.println("Smoke Detected !!! Alert the maintenance team.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void E_CommercePriceComparison() {
        System.out.println("---------------------E Commerce Price Comparison-----------------------");

        System.out.print("Enter Product Name : ");
        String productName = sc.nextLine();

        System.out.printf("Enter price of %s from website 1 : ", productName);
        int price1 = sc.nextInt();

        System.out.printf("Enter price of %s from website 2 : ", productName);
        int price2 = sc.nextInt();

        System.out.printf("Enter price of %s from website 3 : ", productName);
        int price3 = sc.nextInt();

        try {
            int maxPrice = Math.max(price1, Math.max(price2, price3));
            int minPrice = Math.min(price1, Math.min(price2, price3));
            float priceDifference = ((float)(maxPrice - minPrice)/(float)maxPrice)*100;
            System.out.println("Maximum Price : " + maxPrice);
            System.out.println("Minimum Price : " + minPrice);
            System.out.printf("Difference : %.2f%%",priceDifference);
            System.out.println("Best offer is ₹"+minPrice);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void AgeGroupCategorization() {
        System.out.println("---------------------Age Group Categorization-----------------------");

        System.out.println("Enter list of ages : ");
        String line = sc.nextLine();

        String[] sages = line.split("\\s+");
        int n = sages.length;

        int[] ageGroups = new int[n];
        for (int i = 0; i < n; i++)
            ageGroups[i] = Integer.parseInt(sages[i]);

        int child = 0;
        int teen = 0;
        int adult = 0;
        int senior = 0;

        for (int i : ageGroups) {
            if (i > 0 && i <= 12) child++;
            else if (i > 12 && i <= 19) teen++;
            else if (i >= 20 && i < 60) adult++;
            else if (i >= 60 && i <= 100) senior++;
        }

        n = child + teen + adult + senior;
        int childPercent = (int) ((float) child / n * 100);
        int teenPercent = (int) ((float) teen / n * 100);
        int adultPercent = (int) ((float) adult / n * 100);
        int seniorPercent = (int) ((float) senior / n * 100);

        System.out.println("Total no of people : " + n);
        System.out.println("Child  : " + child + " and " + childPercent + "%");
        System.out.println("Teen   : " + teen + " and " + teenPercent + "%");
        System.out.println("Adult  : " + adult + " and " + adultPercent + "%");
        System.out.println("Senior : " + senior + " and " + seniorPercent + "%");

    }

    public void EmployeeSalaryTaxEstimator(){
        System.out.println("---------------------Employee Salary Tax Estimator-----------------------");

        System.out.print("Enter Employee salary : ");
        double salary = sc.nextDouble();
        double tax = 0.0;
        if(salary < 0) System.out.println("Invalid(-ve) Employee Salary...");
        else if (salary < 2_50_000){
            tax = 0.0;
        }
        else if(salary < 5_00_000){
            double taxableAmount = salary - 2_50_000;
            tax = taxableAmount * 0.05;
        }
        else if(salary < 10_000_000){
            double taxableAmount = salary - 5_00_000;
            tax = taxableAmount * 0.20;
            tax += 2_50_000 * 0.05;
        }
        else{
            tax = 2_50_000 * 0.05 +  5_000_000 * 0.20;
            double taxableAmount = salary - 10_00_000;
            tax = taxableAmount * 0.30;
        }
        System.out.println("Tax amount of salary \u20b9"+salary+" is \u20b9"+tax);
    }
}

package assignment2.assignment2Part1;

import java.util.Scanner;

public class SalesSumamryByRegion {
    public static void main(String[] args) {
        Integer sales=0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            if (i == 0) {
                System.out.println("Enter the sales for North region : ");
                sales = scanner.nextInt();
            }
            if (i == 1) {
                System.out.println("Enter the sales for South region : ");
                sales = scanner.nextInt();
            }
            if (i == 2) {
                System.out.println("Enter the sales for East region : ");
                sales = scanner.nextInt();
            }
            if (i == 3) {
                System.out.println("Enter the sales for West region : ");
                sales = scanner.nextInt();
            }

            if (sales > 10000){
                System.out.println("Sales - HIGH");
            } else if (sales>5000 && sales <10000) {
                System.out.println("Sales - MEDIUM");
            } else if (sales<= 5000) {
                System.out.println("Sales - LOW");
                
            }
        }
        }

    }


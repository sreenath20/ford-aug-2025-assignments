package com.demo.Assignment2;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
//        int[] array= new int[10];
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<array.length;i++){
//            array[i]=sc.nextInt();
//        }
//        int total_invoice=0;
//        for(int i=0;i<array.length;i++){
//            total_invoice+=array[i];
//        }
//        System.out.println("Total invoice: "+total_invoice);
        //-----------------Assignment 2_--------------
//        int password=1234;
//        int given_password=0;
      Scanner sc=new Scanner(System.in);
//        int trys=0;
//        do{
//    System.out.println("Enter the password");
//    given_password=sc.nextInt();
//    if(given_password==password){
//        System.out.println("you have successfully logged in");
//        break;
//    }
//    else {
//        System.out.println("you have not logged in retry");
//    }
//        trys++;
//        }
//        while(trys<=2);
//        System.out.println("multiple attempts Try after some times");

        //-----------Assignment 3--------------

//        String[] namesList={"Arul","Akash","Ram","Krishna","Kumar"};
//        for(String name:namesList){
//            System.out.println(name);
//        }

        //--------------Assignment 4--------------------
//

//        int[] sales =new int[4];
//        for(int i=0;i<4;i++){
//            sales[i]=sc.nextInt();
//        }
//        int highest=0,lowest=0,normal=0;
//        for(int i=0;i<4;i++){
//            if(sales[i]<5000){
//                lowest++;
//            }
//            else if(sales[i]>5000 && sales[i]<10000){
//                normal++;
//            }
//            else{
//                highest++;
//            }
//        }
//        System.out.println(highest+" "+lowest+" "+normal);

        //------------Assignment 5
//        System.out.println("enter a num1");
//        int num1=sc.nextInt();
//        System.out.println("enter a num2");
//
//        int num2=sc.nextInt();
//        sc.nextLine();
//        System.out.println("enter the symbol");
//
//        String symbol=sc.nextLine();
//        switch(symbol){
//            case "+":
//                System.out.println(num1+num2);
//                break;
//            case  "-":
//                System.out.println(num1-num2);
//                break;
//            case  "*":
//
//                System.out.println(num1*num2);
//                break;
//            case  "/":
//                System.out.println(num1/num2);
//                 break;
//            default:
//                System.out.println("invalid input");
//
//        }
        //-----------assignment 6-----------

//        String[] array= {"P","D","C","F","P","D","C","F","P","D"};
//        int i=0;
//        for(String str:array){
//            i++;
//            switch(str){
//                case "P":
//                    System.out.println("Order"+i+": Pending");
//                    break;
//                    case "D":
//                        System.out.println("Order"+i+": Done");
//                        break;
//                        case "C":
//                            System.out.println("Order"+i+": Canceled");
//                            break;
//
//                            case "F":
//                                System.out.println("Order"+i+": Failed");
//                                break;
//            }
//        }

        //-------assignment 7-------------

//            do{
//                System.out.println("option available are \nAdmin-1\nManager-2\nViewer-3");
//                int option=sc.nextInt();
//                switch(option){
//                    case 1:
//                        System.out.println("You got the access of Admin");
//
//                        case 2:
//                            System.out.println("You got the access of Manager");
//
//                            case 3:
//                                System.out.println("You got the access of Viewer");
//
//                    default:
//                        System.out.println("Invalid option");
//                        break;
//
//                }
//
//            }while(false);

        //-------------Assignment 8---------------
//        String[] toll_vehicles={"Car","Bike","Bus","Car","Truck"};
//        int total_amount=0;
//        int car=0,bike=0,bus=0,truck=0;
//        for(String toll_vehicle:toll_vehicles){
//            switch(toll_vehicle){
//                case "Car":
//                    total_amount=total_amount+100;
//                    car++;
//                    break;
//                case "Bike":
//                    total_amount=total_amount+50;
//                    bike++;
//                    break;
//                case "Bus":
//                    total_amount=total_amount+200;
//                    bus++;
//                    break;
//                case "Truck":
//                    total_amount=total_amount+250;
//                    truck++;
//                    break;
//                    default:
//                        System.out.println("Invalid Input");
//                    }
//
//        }
//        System.out.println("Total Amount: "+total_amount);
//        System.out.println("Car: "+car);
//        System.out.println("Bike: "+bike);
//        System.out.println("Bus: "+bus);
//        System.out.println("Truck: "+truck);

        //---------Assignment 9--------------
//        char[][] employee={{'p','p','a','l','p','l','p'},{'p','p','p','l','a','a','l'},{'p','p','p','p','p','p','p'}};
//        int present=0,absent=0,leave=0;
//        for(char[] row:employee){
//            for(char element:row){
//                switch(element){
//                    case 'p':
//                        present++;
//                        break;
//                    case 'a':
//                        absent++;
//                        break;
//                    case 'l':
//                        leave++;
//                        break;
//                    default:
//                        System.out.println("Invalid input");
//                }
//
//            }
//            System.out.println("Present is "+present+" and absent is "+absent+" and leave is "+leave);
//            leave=0;
//            present=0;
//            absent=0;
//
//        }
                //-------Assignment 10-------
//        double[] income=new double[5];
//        System.out.println("Enter 5 numbers in an array");
//        for(int i=0;i<5;i++){
//            income[i]=sc.nextInt();
//        }
//        double tax=0;
//        for(double arr:income){
//            if(arr<=250000){
//                System.out.println("The income "+arr+" is less than 250000 so no tax");
//
//            }
//            else if(arr>250000 && arr<500000){
//                tax=(arr*0.05);
//                System.out.println("The tax is "+tax);
//                tax=0;
//            }
//            else if(arr>500000 && arr<100000){
//                tax=(arr*0.2);
//                System.out.println("your tax is "+tax);
//                tax=0;
//            }
//            else{
//                tax=arr*0.3;
//                System.out.println("your tax is "+tax);
//                tax=0;
//            }
//        }

    }
}

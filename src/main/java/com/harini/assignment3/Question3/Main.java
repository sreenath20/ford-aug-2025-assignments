package com.harini.assignment3.Question3;

public class Main {
    public static void main(String[] args) {
        Products electronics = new Electronics("Television",44000.0,"This is Sony Television",21,"5yrs");
        Products Cloth = new Clothing("Tops",450,"This is max T-Shirt",12,"XS","Cotton");
        Products grocerires = new Groceries("Biscuit",25.0,"This is Hide and Seek Biscuit",34,"Best before 6 months from package");
        System.out.println("-------------------Electronics Details----------------------");
        System.out.println(electronics.toString());
        System.out.println("-------------------Cloth Details----------------------");
        System.out.println(Cloth.toString());
        System.out.println("---------------------Groceries Details----------------------");
        System.out.println(grocerires.toString());
    }
}

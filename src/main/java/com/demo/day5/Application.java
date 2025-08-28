package com.demo.day5;

public  abstract class Application { // incomplete class

    private Double data=100.0;

    public void display(){
        modifyData();
        System.out.println("Data="+data);
    }
    private void modifyData(){
        this.data*=1.1;
    }

    public abstract Double futureLogic(); // abstract method i.e incomplete method
//    {
//        // logic is know in future
//    }
//
}

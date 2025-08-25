package com.Assignment_6_1_subpackage;

import com.demo.Assignment_6_1.Hospital_Management_System;

public class Billing extends Hospital_Management_System {

    public Billing(String Medical_History, String Hospital_Id, String Insurance_details, String Name) {
        super(Medical_History, Hospital_Id, Insurance_details, Name);
    }
    public void display(){
        System.out.println("Name: "+Name);
    }
}

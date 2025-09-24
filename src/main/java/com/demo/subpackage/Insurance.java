package com.Assignment.subpackage;
import com.Assignment.Assignment_6_1.Hospital_Management_System;
public class Insurance extends Hospital_Management_System{
    public Insurance(String Medical_History, String Hospital_Id, String Insurance_details, String Name) {
        super(Medical_History, Hospital_Id, Insurance_details, Name);
    }
    public void display(){
        System.out.println("Insurance"+Insurance_details);
    }
}

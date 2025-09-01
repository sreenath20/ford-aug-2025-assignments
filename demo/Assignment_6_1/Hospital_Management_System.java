package com.demo.Assignment_6_1;


import com.demo.subpackage.Insurance;

public class Hospital_Management_System {
    private String Medical_History;
    String  Hospital_Id;
    protected String Insurance_details;
    public String Name;
    public Hospital_Management_System(String Medical_History, String Hospital_Id, String Insurance_details,String Name) {
        this.Medical_History = Medical_History;
        this.Hospital_Id = Hospital_Id;
        this.Insurance_details = Insurance_details;
        this.Name = Name;
    }
    public String getMedical_History() {
        return Medical_History;
    }
}
class Reception extends Hospital_Management_System {
    Reception(String Medical_History, String Hospital_Id, String Insurance_details,String Name) {
        super(Medical_History,Hospital_Id,Insurance_details,Name);
    }
    void display(){
        System.out.println("Patient name: "+Name+"Patient ID: "+Hospital_Id);

    }
}
class main1{
    public static void main(String[] args) {
        Reception reception= new Reception("123@er","1123EC","ABC0988","AK");
        reception.display();
        Insurance insurance = new Insurance("12343de","12456756","werr211","KH");
        insurance.display();
        //Billing b1= new Billing("123456@er","9087Ad","123AK123","kA");
        //b1.display();
    }
}



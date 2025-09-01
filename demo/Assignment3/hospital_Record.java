package com.demo.Assignment3;
//--------------Assignment 6----------------
public class hospital_Record {
    public static void main(String[] args) {
        OutPatient op1= new OutPatient(1023,"Ram","25","9/04/2024");
        op1.displayPatientInfo();
    }

}
class patients{
    private int patientId;
    private String patientName;
    private String patientage;
    public patients(int patientId, String patientName, String patientage){
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientage = patientage;
    }
    int getPatientId(){
        return patientId;
    }
    String getPatientName(){
        return patientName;
    }
    String getPatientage(){
        return patientage;
    }
    void displayPatientInfo(){
        System.out.println("Name: "+getPatientName());
        System.out.println("Age: "+getPatientage());
        System.out.println("ID: "+getPatientId());
    }
}
class OutPatient extends patients{
    private String visitDate;
    OutPatient(int patientId, String patientName, String patientage,String visitDate){
        super(patientId,patientName,patientage);
        this.visitDate=visitDate;
    }
    void displayPatientInfo(){
        System.out.println("Name: "+getPatientName());
        System.out.println("Age: "+getPatientage());
        System.out.println("ID: "+getPatientId()+"visitDate: "+visitDate);

    }
}
class inPatient extends patients{
    private double fee;
    inPatient(int patientId, String patientName, String patientage,double fee){
        super(patientId,patientName,patientage);
        this.fee=fee;
    }
    void displayPatientInfo(){
        System.out.println("Name: "+getPatientName());
        System.out.println("Age: "+getPatientage());
        System.out.println("ID: "+getPatientId()+"fee: "+fee);
    }
}

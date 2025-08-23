package com.assignment1_wrapperclass;

import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the signal in byte format: ");
        int Signal=Integer.parseInt(input.next(),2);
        System.out.println(Signal);
        Byte sig=(byte) Signal; // Convert to byte
        System.out.println("Signal in byte format: " + sig);
        boolean motion = (Signal & 0b00000001) != 0;
        boolean lightOn = (Signal & 0b00000010) != 0;
        boolean tempHigh = (Signal & 0b00000100) != 0;
        boolean humidityHigh = (Signal & 0b00001000) != 0;

        System.out.println("Raw signal: " + Integer.toBinaryString(Signal));
        System.out.println("Motion detected: " + (motion ? "YES" : "NO"));
        System.out.println("Light is ON: " + (lightOn ? "YES" : "NO"));
        System.out.println("Temperature high: " + (tempHigh ? "YES" : "NO"));
        System.out.println("Humidity high: " + (humidityHigh ? "YES" : "NO"));

        if (motion && !lightOn) {
            System.out.println("ALERT: Motion detected and light is OFF. Turning ON light!");
        } else {
            System.out.println("No alert.");
        }


    }
}

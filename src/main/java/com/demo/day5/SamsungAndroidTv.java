package com.demo.day5;

public class SamsungAndroidTv implements AndroidTv{
    @Override
    public void display() {
        System.out.println("Samsung Android TV");
    }

    @Override
    public void switchOn() {
        System.out.println("your Tv is  Switching On...");
    }

    @Override
    public void switchOff() {
        System.out.println("your Tv is  Switching Off...");
    }

    public void info(){
        System.out.println("Samsung TV version 1.0");
    }
    public void internalLogic(){
        System.out.println("Samsung TV internal logic");
    }
}

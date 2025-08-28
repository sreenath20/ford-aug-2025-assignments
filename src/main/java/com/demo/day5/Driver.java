package com.demo.day5;

public class Driver {
    public static void main(String args[]){

        // Abstraction
        //1. abstract class
        // 2. Interfaces

        Application application; // ok
        //application= new Application(); // Application' is abstract; cannot be instantiated
        application = new FutureApplication();
        application.futureLogic();
        application.display();

        AndroidTv tvRemote;
        //androidTv = new AndroidTv(); // 'AndroidTv' is abstract; cannot be instantiated
        tvRemote = new SamsungAndroidTv();
        tvRemote.display();
        tvRemote.switchOn();
        tvRemote.switchOff();
        //androidTv.info();//Cannot resolve method 'info' in 'AndroidTv'
        //androidTv.internalLogic();
//        SamsungAndroidTv samsungAndroidTv;
//        samsungAndroidTv = (SamsungAndroidTv) androidTv;
//        samsungAndroidTv.info();
//        samsungAndroidTv.internalLogic();

        A a;
        B b;
        C c;
        c = new C();
        c.displayA();
        c.displayB();
        a = c;
        a.displayA();
        b = c;
        //b.displayA(); // Cannot resolve method 'displayA' in 'B'
        b.displayB();






    }
}

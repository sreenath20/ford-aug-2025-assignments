package com.oops.day5;

public class Driver {
    public static void main(String[] args) {

        /*//abstraction
        //abstract class
        //interface
        Application application =new FutureApplication();
        application.futurelogic();
        application.display();

        Tv tv1=new SamsungTv();
        tv1.display();*/
        A a;
        B b;
        C c;
        c=new C();
        c.displayA();
        c.displayB();
        a=c;
        a.displayA();
        b=c;
        b.displayB();

    }
}

package com.oops.day4;

public class grandchild extends  child  {
    public void display1() {
        System.out.println("Grandchild  class display 1 method");
    }
    public void diplay2() {
        System.out.println("Grandchild  class display 2 method");
    }
    public void display3() {
        System.out.println("Grand child  class display 3 method");
        super.display1();
    }
}

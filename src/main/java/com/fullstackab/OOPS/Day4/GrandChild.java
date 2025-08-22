package com.fullstackab.OOPS.Day4;

public class GrandChild extends Child {
   private int data = 20;

    public GrandChild() {
        super();
    }

  public void display(){
      System.out.println("GrandChild Data = :" +data);
      System.out.println("GrandChild displaying parent data :" +super.data);
   }
}

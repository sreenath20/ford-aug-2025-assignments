package com.fullstackab.OOPS.Day4;

public class Child extends Parent {

    int data = 50;

    public Child() {
    }
        public void display () {
            System.out.println("Child Data = :" + this.data);
            System.out.println("Child class displaying parent data :" +super.data);
            super.display();
        }
    }

package com.oops.day5;

public abstract class Application {
    private Double data = 100.0;

    public void display() {
        System.out.println("data: " + data);
    }

    private void modifyData() {
        this.data *= 1.1;
    }
    public abstract Double futurelogic() ;
}

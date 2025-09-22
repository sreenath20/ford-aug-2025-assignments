package javatopic.day4_inheritance_encapsulation.classdemo;

import java.util.Objects;

public class Parent extends Object{
    Integer data=100;
    Integer data2=300;
    public void Display(){
        System.out.println("Parent Display");
    }

    @Override  // it is simple to specify that it override the parent that is the object class
    public boolean equals(Object o) {
        if (!(o instanceof Parent parent)) return false;
        return Objects.equals(data, parent.data) && Objects.equals(data2, parent.data2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, data2);
    }
}

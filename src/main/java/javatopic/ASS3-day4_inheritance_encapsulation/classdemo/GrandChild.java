package javatopic.day4_inheritance_encapsulation.classdemo;

public class GrandChild extends Child {
    @Override

    public void Display() {
        System.out.println("GrandChild Display");
        System.out.println("immediate parent data"+super.data2);

    }
}

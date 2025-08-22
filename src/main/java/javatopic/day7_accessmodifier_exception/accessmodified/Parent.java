package javatopic.day7_accessmodifier_exception.accessmodified;

// private class Parent is not allowed
// java want every file to be modular
public class Parent {

    public String name="Ford"; // public
    private String city="chennai";
    String country="India";
    protected String state="TN";

    private void display() {
        System.out.println("display");
    }
// private method can be accessed indirectly with public method
    public void help(){
        display();
        System.out.println("help");
    }
}


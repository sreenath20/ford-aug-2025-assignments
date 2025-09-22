package javatopic.day4_inheritance_encapsulation.classdemo;

public class Child extends Parent {
    Integer data=200;
    public Child(){ // this constructor is implicitly created when Child child =new Child() is implemented
        super();// to access immediate parent
    }
    public void Display(){
        System.out.println("Child Display");
        System.out.println("child data"+this.data); //
        System.out.println("parent data"+super.data);
        super.Display();

    }
    public void Info(){
        System.out.println("Child Info");
    }

}

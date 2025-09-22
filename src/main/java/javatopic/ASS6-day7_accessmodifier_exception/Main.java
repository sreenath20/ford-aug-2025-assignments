package javatopic.day7_accessmodifier_exception;

import javatopic.day7_accessmodifier_exception.accessmodified.Parent;

public class Main extends Parent {
    String name=super.name;
    //String country=super.country; // here country is default
    String state=super.state;// state protected
    //String city=super.city// private cannot access

}

package javatopic.day7_accessmodifier_exception.exception;

public class Main {
    // try - business logic block
    // catch - error handling block
    // finally -dealloacte resources i.e finally will always get executed

    //rule
    //1.10/0 unchecked exception by compiler
    // all obj created by runtime exception
    // there are child of runtime exception
    //
    public static void main(String[] args) {
        first();
    }
    static void first() {
        second();
    }
    static void second() {
        int a=10/0;
    }
}

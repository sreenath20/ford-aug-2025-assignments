package javatopic.day6polymorphism.assignmnent.assignment6;

public interface SecurityCheck {
    static void logAttempt(String user){
        // this is static method can be called with interface name
        System.out.println("login by user:"+user);
    }
    default void showSecurityStatus(){
        System.out.println("Secure connection established");

    }

    boolean verifyUser(String username,String password);

}

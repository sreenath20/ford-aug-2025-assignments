public interface SecurityCheck {
    static void logAttempt(String user){
        System.out.println(user+" attempted to login ");
    }

    default void showSecurityStatus(){
        System.out.println("Security connection established");
    }
    Boolean verifyUser(String userName,String password);
}

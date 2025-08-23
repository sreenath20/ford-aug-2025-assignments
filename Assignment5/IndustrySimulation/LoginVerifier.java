package Assignment5.IndustrySimulation;


public class LoginVerifier implements SecurityCheck {
    @Override
    public boolean verifyUser(String username, String password) {
        return username.equals("admin") && password.equals("pass123");
    }
}

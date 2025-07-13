public class PasswordAuth implements AuthStrategy{

    @Override
    public boolean authenticate(String userId, String password) {
        System.out.println("Authenticating via username/password for : "+userId);
        return "Password123".equals(password);
    }
}

public class AuthenticationApp {
    public static void main(String[] args) {
        AuthService authService = new AuthService();

        //login via login password
        authService.setAuthStrategy(new PasswordAuth());
        authService.login("nishant", "Password123");
        authService.login("nishant", "Abcd@1234");

        //login via OAuth
        authService.setAuthStrategy(new OAuthAuth());
        authService.login("nishant", "oauth_abc123");
        authService.login("nishant", "1234");

        //login via otp
        authService.setAuthStrategy(new OtpAuth());
        authService.login("nishant", "1234");
        authService.login("nishant", "574549");
    }
}

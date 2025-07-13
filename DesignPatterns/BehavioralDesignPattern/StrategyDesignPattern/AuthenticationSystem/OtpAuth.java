public class OtpAuth implements AuthStrategy{
    @Override
    public boolean authenticate(String userId, String otp) {
        System.out.println("Authenticating via otp for : "+userId);
        return "1234".equals(otp);
    }
}

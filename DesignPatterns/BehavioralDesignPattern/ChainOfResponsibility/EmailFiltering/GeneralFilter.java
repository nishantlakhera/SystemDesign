public class GeneralFilter extends EmailHandler{
    @Override
    protected boolean handleEmail(Email email) {
        System.out.println("Email from "+email.getSender()+ " is moved to the general inbox.");
        return true;
    }
}

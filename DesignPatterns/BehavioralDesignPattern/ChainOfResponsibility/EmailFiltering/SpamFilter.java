public class SpamFilter extends EmailHandler{
    @Override
    protected boolean handleEmail(Email email) {
        if(email.isSpam()){
            System.out.println("Email from "+email.getSender()+ " is marked as spam. Processing stopped.");
            return false;
        }
        System.out.println("Spam filter passed.");
        return true;
    }
}

public class BusinessFilter extends EmailHandler{
    @Override
    protected boolean handleEmail(Email email) {
        if(email.isBusiness()){
            System.out.println("Email from "+email.getSender()+ " is flagged as Business Priority");
        }else{
            System.out.println("Business filter passed.");
        }
        return true;
    }
}

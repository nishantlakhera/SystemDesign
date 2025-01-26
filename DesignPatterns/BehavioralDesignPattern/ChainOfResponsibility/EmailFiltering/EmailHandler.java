abstract class EmailHandler {

    protected EmailHandler nextHandler;

    public void setNextEmailHandler(EmailHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void processEmail(Email email){
        if(handleEmail(email)){
            if(nextHandler != null){
                nextHandler.processEmail(email);
            }
        }
    }

    protected  abstract boolean handleEmail(Email email);

}

public class Email {
    private String sender;
    private String subject;
    private String body;
    private boolean spam;
    private boolean business;

    public Email(String sender, String subject, String body, boolean spam, boolean business){
        this.sender = sender;
        this.subject = subject;
        this.body = body;
        this.spam = spam;
        this.business = business;
    }

    public boolean isSpam(){
        return spam;
    }
    public boolean isBusiness(){
        return business;
    }
    public String getSubject(){
        return subject;
    }
    public String getSender(){
        return sender;
    }
    public String getBody(){
        return body;
    }

}

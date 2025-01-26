//Authentication Handler
public class AuthenticationHandler extends Handler{

    @Override
    protected boolean processRequest(Request request) {
        if(request.isAuthenticated()){
            System.out.println("Authentication Successful");
            return true;
        }else{
            System.out.println("Authentication failed.");
            return false;
        }
    }

}

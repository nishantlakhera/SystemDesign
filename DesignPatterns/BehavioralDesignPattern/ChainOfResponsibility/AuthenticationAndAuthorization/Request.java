//Request class
public class Request {
    private boolean authenticated;
    private String role;
    private boolean hasPermission;
    public Request(boolean authenticated, String role, boolean hasPermission){
        this.authenticated = authenticated;
        this.role = role;
        this.hasPermission = hasPermission;
    }

    public boolean isAuthenticated(){
        return authenticated;
    }

    public String getRole(){
        return  role;
    }

    public boolean isHasPermission(){
        return hasPermission;
    }

}

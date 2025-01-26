public class RoleCheckHandler extends Handler{
    private String requireRole;
    public RoleCheckHandler(String requireRole){
        this.requireRole = requireRole;
    }

    @Override
    protected boolean processRequest(Request request) {
        if(request.getRole().equals(requireRole)){
            System.out.println("Role check successful. Role : "+requireRole);
            return true;
        }else {
            System.out.println("Role check failed. Required role: "+requireRole);
            return false;
        }
    }

}

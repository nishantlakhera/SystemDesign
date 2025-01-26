public class PermissionCheckHandler extends Handler{
    @Override
    protected boolean processRequest(Request request) {
        if(request.isHasPermission()){
            System.out.println("Permission check successful.");
            return true;
        }else{
            System.out.println("Permission check failed.");
            return false;
        }
    }
}

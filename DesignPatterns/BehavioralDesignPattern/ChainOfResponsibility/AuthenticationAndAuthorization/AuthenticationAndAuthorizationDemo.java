public class AuthenticationAndAuthorizationDemo {
    public static void main(String[] args) {
        Handler authenticationHandler = new AuthenticationHandler();
        Handler roleCheckHandler = new RoleCheckHandler("Admin");
        Handler permissionCheckHandler = new PermissionCheckHandler();

        authenticationHandler.setNextHandler(roleCheckHandler);
        roleCheckHandler.setNextHandler(permissionCheckHandler);

        Request request1 = new Request(true, "Admin", true); //valid request
        Request request2 = new Request(true, "User", true); //invalid request
        Request request3 = new Request(false, "Admin", true); // Not authenticated

        System.out.println("Processing request 1:");
        authenticationHandler.handleRequest(request1);

        System.out.println("\nProcessing request 2:");
        authenticationHandler.handleRequest(request2);

        System.out.println("\nProcessing request 3:");
        authenticationHandler.handleRequest(request3);

    }
}

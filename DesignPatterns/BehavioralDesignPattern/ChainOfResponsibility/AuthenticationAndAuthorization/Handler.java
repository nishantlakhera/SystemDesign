//Abstract Handler
abstract class Handler {
    protected Handler nextHandler;
    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
    public void handleRequest(Request request){
        if(processRequest(request)){
            if(nextHandler != null){
                nextHandler.handleRequest(request);
            }
        }else{
            System.out.println("Request processing stopped.");
        }
    }
    protected abstract boolean processRequest(Request request);
}

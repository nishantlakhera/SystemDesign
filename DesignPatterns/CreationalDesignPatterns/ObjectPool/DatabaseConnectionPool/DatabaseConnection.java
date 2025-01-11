public class DatabaseConnection {

    private String connectionId;

    public DatabaseConnection(String connectionId){
        this.connectionId = connectionId;
    }

    public String getConnectionId(){
        return connectionId;
    }

    public void connect(){
        System.out.println("Connected to database: "+ connectionId);
    }

    public void disconnect(){
        System.out.println("Disconnected to database: "+ connectionId);
    }

}

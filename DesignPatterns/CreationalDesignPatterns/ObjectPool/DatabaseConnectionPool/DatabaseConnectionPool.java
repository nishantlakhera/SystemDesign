import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class DatabaseConnectionPool {
    private BlockingDeque<DatabaseConnection> pool;

    public DatabaseConnectionPool(int size){
        pool = new LinkedBlockingDeque<>(size);
        for(int i = 0; i < size; i++){
            pool.add(new DatabaseConnection("Connection-" + (i + 1)));
        }
    }

    public DatabaseConnection acquireConnection() throws InterruptedException{
        return pool.take();
    }

    public void releaseConnection(DatabaseConnection connection){
        pool.offer(connection);
    }

}

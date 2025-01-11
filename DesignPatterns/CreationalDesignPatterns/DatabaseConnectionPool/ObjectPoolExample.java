public class ObjectPoolExample {
    public static void main(String[] args) throws InterruptedException {
        DatabaseConnectionPool connectionPool = new DatabaseConnectionPool(3);

        DatabaseConnection connection1 = connectionPool.acquireConnection();
        connection1.connect();

        DatabaseConnection connection2 = connectionPool.acquireConnection();
        connection2.connect();

        connection1.disconnect();
        connectionPool.releaseConnection(connection1);

        DatabaseConnection connection3 = connectionPool.acquireConnection();
        connection3.connect();

    }
}

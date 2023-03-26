package singleton_sync.com.app;

public class DatabaseConnector {
    //    eager loading instance
//    public static DatabaseConnector INSTANCE = new DatabaseConnector();
    private static DatabaseConnector INSTANCE;

    //    Pron to reflection Attack
    private DatabaseConnector() {
    }

    public static DatabaseConnector getINSTANCE() {
//synchronized - allow only one thread to execute synchronized block at a time
//Slow down execution
        synchronized (DatabaseConnector.class) {
            if (INSTANCE == null) {
                INSTANCE = new DatabaseConnector();
            }
        }

        return INSTANCE;
    }

    public void connect() {
        System.out.println("Connecting to db");
    }

    public void disconnect() {
        System.out.println("Disconnecting from db");
    }
}

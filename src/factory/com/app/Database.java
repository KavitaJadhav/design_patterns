package factory.com.app;

//Enum are compile time instances, threadsafe
//have to use synchronization in methods explicitly to make them threadsafe
public enum Database {
    INSTANCE;

    public void connect() {
        System.out.println("Connecting to db");
    }

    public void disconnect() {
        System.out.println("Disconnecting from db");
    }
}

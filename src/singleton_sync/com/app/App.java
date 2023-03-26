package singleton_sync.com.app;

public class App {
    public static void main(String[] args) {
        DatabaseConnector.getINSTANCE().connect();
        DatabaseConnector.getINSTANCE().disconnect();

        DatabaseConnector c1 = DatabaseConnector.getINSTANCE();
        DatabaseConnector c2 = DatabaseConnector.getINSTANCE();

        System.out.println("Checking if Instance are same: " + (c1 == c2));

    }
}
//creational design patterns
//Used to create only one instance
//it's not thread safe
//use synchronized block to make it threadsafe, it can slow down execution
//prone to reflection attack even after synchronization


//    eager loading instance
//    public static DatabaseConnector INSTANCE = new DatabaseConnector();

//lazy loading instance
//        if (INSTANCE == null) {
//        INSTANCE = new DatabaseConnector();
//        }

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
package singleton_enum.com.app;

public class App {
    public static void main(String[] args) {

        Database.INSTANCE.connect();
        Database.INSTANCE.disconnect();

        Database d1 = Database.INSTANCE;
        Database d2 = Database.INSTANCE;
        System.out.println("Checking if Instance are same: " + (d1 == d2));

    }
}
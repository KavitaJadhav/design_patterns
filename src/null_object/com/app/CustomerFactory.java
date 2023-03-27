package null_object.com.app;

public class CustomerFactory {
    private Database database;

    public CustomerFactory() {
        this.database = new Database();
    }

    public Customer getCustomer(String name) {
        return database.exists(name) ? new RealCustomer(name) : new NullCustomer();
    }
}

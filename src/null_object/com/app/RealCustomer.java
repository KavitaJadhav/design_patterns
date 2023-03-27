package null_object.com.app;

public class RealCustomer extends Customer {
    private String name;

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean present() {
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}

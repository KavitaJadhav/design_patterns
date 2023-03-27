package null_object.com.app;

public class NullCustomer extends Customer{
    @Override
    public boolean present() {
        return false;
    }

    @Override
    public String getName() {
        return "Customer does not present";
    }
}

// Null object pattern is used to represent absence ob object
//it is used to avoid null pointer exception and avoid if checks

package null_object.com.app;

public class App {
    public static void main(String[] args) {
        CustomerFactory factory = new CustomerFactory();
        System.out.println(factory.getCustomer("Kavita").getName());
        System.out.println(factory.getCustomer("random").getName());
    }
}

//Customer - Abstract class
//NullCustomer, RealCustomer
//RealCustomer
//Database(List of customer name)
//CustomerFactory(read customer)
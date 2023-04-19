// Behavioural Pattern
// Null object pattern is used to represent absence ob object
// It is used to avoid null pointer exception and avoid if checks

package null_object.com.app;

public class App {
    public static void main(String[] args) {
        CustomerFactory factory = new CustomerFactory();
        System.out.println(factory.getCustomer("Kavita").getName());
        System.out.println(factory.getCustomer("random").getName());
    }
}

//Database(List of customer name)
//CustomerFactory - Maintains customer database(read/write customer customer)
//Customer - Abstract class
//RealCustomer -inherits customer, return values based on input
//NullCustomer - inherits customer,return default behaviour
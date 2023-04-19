//Structural Pattern

//Adapter patten is used to support legacy code
//It behaves as interface between legacy code and new model design

//Facade vs Adaptor
//Facade - provide interface to connect with libraries
//Adaptor - Enables both way communication between library and application(Exp. changing request/response format)


//Adapter pattern in Java
// Old format - String names[] = {"Kavita", "Jyoti"}
// New format - List<String> names = new ArrayList()
//List<String> names  = Array.asList(names)   ---> Adaptor


//Explanation
//Legacy classes Car, Bus (with method accelerate)
//Support Bicycle vehicle - Bicycle doesn't accelerate (add a wrapper/adaptor)

package adapter.com.app;

public class App {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.accelerate();

        Vehicle bus = new Bus();
        bus.accelerate();

        Vehicle bicycle = new BicycleAdapter(new Bicycle());
        bicycle.accelerate();
    }
}


//Vehicle interface - accelerate method
// Car, Bus implement Vehicle
// bicycle
//BicycleAdapter implements Vehicle
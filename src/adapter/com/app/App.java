//Adapter patten is used to support legacy code
//It behaves as interface between legacy code and new model design

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
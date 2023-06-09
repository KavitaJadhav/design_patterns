package adapter.com.app;

public class BicycleAdapter implements Vehicle {

    Bicycle bicycle;

    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        bicycle.go();
    }
}

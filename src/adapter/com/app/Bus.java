package adapter.com.app;

public class Bus implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Bus is accelerated");
    }
}

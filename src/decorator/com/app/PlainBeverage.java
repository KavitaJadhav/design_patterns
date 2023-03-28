package decorator.com.app;

public class PlainBeverage implements Beverage {
    @Override
    public String get_name() {
        return "";
    }

    @Override
    public double get_cost() {
//        Base price considered 5
        return 5;
    }
}

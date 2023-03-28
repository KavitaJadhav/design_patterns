package decorator.com.app;

public class SugarBeverage extends BeverageDecorator {
    public SugarBeverage(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String get_name() {
        return beverage.get_name() + " Sugar";
    }

    @Override
    public double get_cost() {
//        Base cost for sugar 1
        return beverage.get_cost() + 1;
    }
}

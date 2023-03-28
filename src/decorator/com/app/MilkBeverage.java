package decorator.com.app;

public class MilkBeverage extends BeverageDecorator {
    public MilkBeverage(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String get_name() {
        return beverage.get_name() + " Milk";
    }

    @Override
    public double get_cost() {
//        Base cost for milk 5
        return beverage.get_cost() + 5;
    }
}

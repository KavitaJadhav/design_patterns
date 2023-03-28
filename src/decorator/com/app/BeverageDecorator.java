package decorator.com.app;

public abstract class BeverageDecorator implements Beverage{
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String get_name() {
        return beverage.get_name();
    }

    @Override
    public double get_cost() {
        return beverage.get_cost();
    }
}

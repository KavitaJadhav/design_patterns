package abstract_factory.com.app;

public class ElectricCarFactory implements AbstractFactory {
    @Override
    public Car getCar(CarCompany name) {
        if (name == CarCompany.FORD)
            return new ElectricFord();
        if (name == CarCompany.TOYOTO)
            return new ElectricToyoto();
        return null;
    }
}

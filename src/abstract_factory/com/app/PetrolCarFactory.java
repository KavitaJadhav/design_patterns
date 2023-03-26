package abstract_factory.com.app;

public class PetrolCarFactory implements AbstractFactory {
    @Override
    public Car getCar(CarCompany name) {
        if (name == CarCompany.FORD)
            return new PetrolFord();
        if (name == CarCompany.TOYOTO)
            return new PetrolToyoto();

        return null;
    }
}

package abstract_factory.com.app;

public class FactoryProducer {
    public AbstractFactory getFactory(CarType type) {
        if (type == CarType.PETROL)
            return new PetrolCarFactory();
        if (type == CarType.ELECTRIC)
            return new ElectricCarFactory();

        return null;
    }

}

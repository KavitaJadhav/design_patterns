package abstract_factory.com.app;

public class PetrolToyoto implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling Petrol Toyoto car");
    }
}


//FactoryProducer(string type - petrol/electronic)
//
//    AbstractFactory - getcar
//    ElectricAbstarctFactory(name  - Toyato/ford) -> AbstractFactory
//    PerolAbstarctFactory(name  - Toyato/ford) -> AbstractFactory
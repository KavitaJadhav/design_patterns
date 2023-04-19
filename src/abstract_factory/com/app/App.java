//Abstract factory pattern is used to generate nested factory objects

//It will have main factory(abstract factory) - which will return instance of sub/nested factory
//on instance of nested factory, call a method to create a new object



package abstract_factory.com.app;

public class App {
    public static void main(String[] args) {
        AbstractFactory electric_factory = new FactoryProducer().getFactory(CarType.ELECTRIC);
        electric_factory.getCar(CarCompany.FORD).assemble();
        electric_factory.getCar(CarCompany.TOYOTO).assemble();

        AbstractFactory petrol_factory = new FactoryProducer().getFactory(CarType.PETROL);
        petrol_factory.getCar(CarCompany.FORD).assemble();
        petrol_factory.getCar(CarCompany.TOYOTO).assemble();
    }
}

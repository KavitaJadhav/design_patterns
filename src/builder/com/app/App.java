// Problems with large classes
//1. Difficult to manage large list of attributes. have to create multiple constructors to manage optional parameters etc.
//2. Adding new attributes needs changes at multiple places
//3. Manage sequence of parameters

// Benefits of using builder pattern
//1. Multiple constructors (telescoping constructors)
//2. New attributes can be added without changes at multiple place
//3. Tread safe
//4. Immutable objects - as objects setters not added in main class

package builder.com.app;

import abstract_factory.com.app.AbstractFactory;
import abstract_factory.com.app.CarCompany;
import abstract_factory.com.app.CarType;
import abstract_factory.com.app.FactoryProducer;

public class App {
    public static void main(String[] args) {

        Person person1 = new Person.PersonBuilder("Kavita", "kavita@email.com").build();
        Person person2 = new Person.PersonBuilder("Jyoti", "jyoti@email.com").set_address("Pune").set_age(25).build();

        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
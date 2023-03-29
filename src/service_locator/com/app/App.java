//Structural design pattern
//it contain repository of services and application can access service from repository when required
//It follows dependency inversion principle - loosely couple architecture
//it identify service at run time. Runtime error instead of compile time error

//JNDI - Java Naming and Directory Interface API
//The Java Naming and Directory Interface™ (JNDI) is an application programming interface (API) that provides naming and directory functionality to applications written using the Java™ programming language.
//It is defined to be independent of any specific directory service implementation.
// Thus a variety of directories -new, emerging, and already deployed can be accessed in a common way.


package service_locator.com.app;

public class App {
    public static void main(String[] args) {
        ServiceLocator locator = new ServiceLocator();
        locator.locate("SMS").execute();
        locator.locate("SMS").execute();
        locator.locate("DATABASE").execute();
        locator.locate("DATABASE").execute();
    }
}

//Service interface - execute method
//DatabaseService, SMSService - implements service
//Cache - Store recently accessed service(Can it be stored in ServiceLocator? - Can break single responsibility principle and dependency inversion principle)
//Service Repository(have list of all services) - CreateService method
//ServiceLocator class - It will find or create service from cache

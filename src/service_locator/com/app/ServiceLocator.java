package service_locator.com.app;

public class ServiceLocator {
    private Cache cache = new Cache();

    public Service locate(String name) {
        Service service = cache.find(name);
        if (service != null) {
            System.out.println("Found service in Cache Service: " + name);
            return service;
        }

        ServiceRepository repository = new ServiceRepository();
        System.out.println("Service missing in cache. Creating Service: " + name);
        service = repository.get(name);
        cache.add(service);
        return service;
    }
}

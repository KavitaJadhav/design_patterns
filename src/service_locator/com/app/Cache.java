package service_locator.com.app;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private Map<String, Service> serviceMap = new HashMap<>();

    public Service find(String serviceName) {
        return serviceMap.get(serviceName);
    }

    public void add(Service service) {
        serviceMap.put(service.getName(), service);
    }
}

package service_locator.com.app;

public class ServiceRepository {
    public Service get(String serviceName) {
        switch (serviceName) {
            case "DATABASE":
                return new DatabaseService();
            case "SMS":
                return new SMSService();
            default:
                return null;
        }
    }
}

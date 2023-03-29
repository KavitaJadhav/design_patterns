package service_locator.com.app;

public class SMSService implements Service {
    private final String name = "SMS";
    @Override
    public void execute() {
        System.out.println("Executing SMS service");
    }

    @Override
    public String getName() {
        return name;
    }
}

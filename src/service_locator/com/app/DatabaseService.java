package service_locator.com.app;

import singleton_enum.com.app.Database;

public class DatabaseService implements Service {
    private final String name = "Database";

    @Override
    public void execute() {
        System.out.println("Executing Database service");
    }

    @Override
    public String getName() {
        return name;
    }
}

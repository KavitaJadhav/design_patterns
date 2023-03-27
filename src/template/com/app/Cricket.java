package template.com.app;

import java.util.List;

public class Cricket extends Game {
    public Cricket(List<Teams> teams) {
        super(teams);
    }

    @Override
    protected void initialize() {
        System.out.println("Initializing Game Cricket");
    }

    @Override
    protected void start() {
        System.out.println("Starting Game Cricket");

    }

    @Override
    protected void end() {
        System.out.println("Completing Game Cricket");
    }
}

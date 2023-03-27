package template.com.app;

import java.util.List;

public class Football extends Game {
    public Football(List<Teams> teams) {
        super(teams);
    }

    @Override
    protected void initialize() {
        System.out.println("Initializing Game Football");
    }

    @Override
    protected void start() {
        System.out.println("Starting Game Football");

    }

    @Override
    protected void end() {
        System.out.println("Completing Game Football");
    }
}

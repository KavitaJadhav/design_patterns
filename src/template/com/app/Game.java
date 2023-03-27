package template.com.app;

import java.util.List;

public abstract class Game {
    List<Teams> teams;

    public Game(List<Teams> teams) {
        this.teams = teams;
    }

    protected abstract void initialize();

    protected abstract void start();

    protected abstract void end();

    public final void play() {
        initialize();
        start();
        end();
    }
}

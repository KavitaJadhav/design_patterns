package command.com.app;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void runCommands(){
        commands.forEach(command -> command.execute());
    }
}

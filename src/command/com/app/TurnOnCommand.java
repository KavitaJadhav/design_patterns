package command.com.app;

public class TurnOnCommand implements Command {

    private Light light = new Light();

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOnLights();
    }
}

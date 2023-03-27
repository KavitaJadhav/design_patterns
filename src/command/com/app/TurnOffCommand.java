package command.com.app;

public class TurnOffCommand implements Command {

    private Light light = new Light();

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOffLights();
    }
}

//Command pattern insures separation of concerns, dependency inversion(abstraction)
//Components-  receiver, command, invoker, client
//invoker knows about abstract task, doesn't know internals(ensures encapsulation)
//Single responsibility(separation of concerns) (prefer new class for each command from invoker)


package command.com.app;

public class App {
    public static void main(String[] args) {

        Light light = new Light();
        Switcher switcher = new Switcher();
        TurnOnCommand turnOnCommand = new TurnOnCommand(light);
        TurnOffCommand turnOffCommand = new TurnOffCommand(light);

        switcher.addCommand(turnOnCommand);
        switcher.addCommand(turnOffCommand);
        switcher.runCommands();
    }
}


//Interface command
//Light - receiver
//TurnOnLight, TurnOffLight implements Light
//Switcher - bookkeeping, execute all commands
//

//Behavioural design pattern
//Command pattern insures separation of concerns, dependency inversion(abstraction)
//caller doesn't know about internal implementation. It calls abstract command

//Components-
// 1. Client - It performs tasks / starts the flow
// 2. Invoker - It takes instruction from client and call command. It knows behaviour(contract of command but not internal(execution part)
// 3. Command - Command has task information and parameters list. It calls receiver
// 4. Receiver - It executes the command
//Invoker knows about abstract task, doesn't know internals(ensures encapsulation)
//Single responsibility(separation of concerns) (prefer creating a new class for each command from invoker)



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
//Switcher(Invoker) - bookkeeping, execute all commands
//App - client

//Command pattern insures separation of concerns, dependency inversion(abstraction)
//Components-  receiver, command, invoker, client
//invoker knows about abstract task, doesn't know internals(ensures encapsulation)
//Single responsibility(separation of concerns) (prefer new class for each command from invoker)


package command_queue.com.app;

public class App {
    public static void main(String[] args) {

        Algorithm algorithm = new Algorithm();
        algorithm.produce();
        algorithm.consume();
    }
}

//Task - execute
//Algorithm - produce, consume methods
//TaskRunner(runtask) class implements Command interface

package command_queue.com.app;

public class TaskRunner implements Command {
    private Task task;

    public TaskRunner(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        task.run();
    }
}

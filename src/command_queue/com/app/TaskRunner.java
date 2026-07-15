package command_queue.com.app;

public class TaskRunner implements Command {
    private Task task;

    public TaskRunner(Task task) {
        this.task = task;
        System.out.println("Added task with id: " + task.getId());
    }

    @Override
    public void execute() {
        task.run();
    }
}

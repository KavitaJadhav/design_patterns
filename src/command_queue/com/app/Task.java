package command_queue.com.app;

public class Task {
    private int id;

    public Task(int id) {
        this.id = id;
        System.out.println("Added task with id: " + id);
    }

    public void run() {
        System.out.println("Running task with id: " + id);
    }
}

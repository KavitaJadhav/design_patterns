package command_queue.com.app;

public class Task {
    public int getId() {
        return id;
    }

    private int id;

    public Task(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Running task with id: " + id);
    }
}

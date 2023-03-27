package iterator.com;

import java.util.ArrayList;
import java.util.List;

public class TaskIterator {
    private ListIterator iterator;
    private List<Task> taskList;

    public TaskIterator(ArrayList taskList) {
        this.taskList = taskList;
        this.iterator = new ListIterator(taskList);
    }

    public ListIterator getIterator() {
        return iterator;
    }
}

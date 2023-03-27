//Iterator pattern is used to iterate over collection of item irrespective of their type/internal details
package iterator.com;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("-----Printing people list-----");

        List<Person> people_list = new ArrayList<>();
        people_list.add(new Person("Kavita"));
        people_list.add(new Person("Jyoti"));
        people_list.add(new Person("Ravi"));

        PersonIterator personIterator = new PersonIterator((ArrayList) people_list);

        while (personIterator.getIterator().hasNext()) {
            System.out.println(personIterator.getIterator().next().toString());
        }

        System.out.println("-----Printing task list-----");

        List<Task> task_list = new ArrayList<>();
        task_list.add(new Task("Charge Laptop"));
        task_list.add(new Task("Recharge"));

        TaskIterator taskIterator = new TaskIterator((ArrayList) task_list);

        while (taskIterator.getIterator().hasNext()) {
            System.out.println(taskIterator.getIterator().next().toString());
        }
    }
}

//Iterator interface (hasNext and next methods)
//ListIterator implements Iterator
// TaskList implements iterator
//PersonList implements iterator
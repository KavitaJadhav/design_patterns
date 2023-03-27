package iterator.com;

import java.util.ArrayList;
import java.util.List;

public class PersonIterator {
    private ListIterator iterator;
    private List<Person> people_list;

    public PersonIterator(ArrayList people_list) {
        this.people_list = people_list;
        this.iterator = new ListIterator(people_list);
    }

    public ListIterator getIterator() {
        return iterator;
    }
}

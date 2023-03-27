package iterator.com;

import java.util.List;

public class ListIterator implements Iterator {
    private int index = 0;
    private List<Object> list;

    public ListIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Object next() {
        return list.get(index++);
    }
}

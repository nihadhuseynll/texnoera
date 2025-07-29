package generic;

import java.util.List;

public class DataProcessor<T> {
    private List<T> items;

    public DataProcessor(List<T> items) {
        this.items = items;
    }

    public void printAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public T getFirst() {
        if (items.isEmpty()) return null;
        return items.getFirst();
    }

    public int count() {
        return items.size();
    }
}

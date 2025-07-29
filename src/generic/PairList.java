package generic;

import java.util.ArrayList;
import java.util.List;

public class PairList<T, U> {
    private List<Pair<T, U>> items;

    public PairList() {
        items = new ArrayList<>();
    }

    public void addPair(T first, U second) {
        items.add(new Pair<>(first, second));
    }

    public void printAllPairs() {
        for (Pair<T, U> pair : items) {
            System.out.println(pair);
        }
    }

    public int size() {
        return items.size();
    }

    public Pair<T, U> getPair(int index) {
        return items.get(index);
    }
}


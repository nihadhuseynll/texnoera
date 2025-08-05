package collections;

import java.util.List;

public class FindElement {

    public static <T> int findIndexOfElement(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }

        return -1;
    }
}

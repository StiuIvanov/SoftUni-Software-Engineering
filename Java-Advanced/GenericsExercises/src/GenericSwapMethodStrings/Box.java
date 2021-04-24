package GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    public List<T> item;

    public Box() {
        this.item = new ArrayList<>();
    }

    public void swapItems(int firstIndex, int secondIndex) {
        T oldItem = this.item.get(firstIndex);
        this.item.set(firstIndex, this.item.get(secondIndex));
        this.item.set(secondIndex, oldItem);

    }

    public void add(T t) {
        this.item.add(t);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (T t : item) {
            stringBuilder.append(String.format("%s: %s", t.getClass().getName(), t))
                    .append(System.lineSeparator());
        }

        return stringBuilder.toString().trim();
    }
}

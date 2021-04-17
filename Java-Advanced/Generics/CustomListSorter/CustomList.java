package CustomListSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> value;

    public CustomList() {
        this.value = new ArrayList<>();
    }

    public void add(T element) {
        value.add(element);
    }

    public T remove(int index) {
        validateIndex(index);
        return value.remove(index);
    }

    public boolean contains(T element) {
        return value.contains(element);
    }

    public void swap(int index1, int index2) {
        validateIndex(index1);
        validateIndex(index2);

        Collections.swap(this.value, index1, index2);
    }

    public int countGreaterThan(T element) {
        int count = (int) value.stream()
                .filter(e -> e.compareTo(element) > 0)
                .count();
        return count;
    }

    public T getMax() {
//        Collections.max(value);
        isEmpty();
        T max = value.get(0);
        for (int i = 1; i < value.size(); i++) {
            if (value.get(i).compareTo(max) > 0) {
                max = value.get(i);
            }
        }
        return max;
    }

    public T getMin() {
        return Collections.min(value);
    }

    private void isEmpty() {
        if (value.isEmpty()) {
            throw new IllegalStateException("Empty list!");
        }
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= this.value.size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public void print() {
        value.forEach(System.out::println);
    }

    public T get(int i) {
        return value.get(i);
    }

    public int size(){
        return this.value.size();
    }

    public T forEach(CustomList<T> customList){
        for (int i = 0; i < customList.size(); i++) {
            customList.get(i);
        }
    }

}

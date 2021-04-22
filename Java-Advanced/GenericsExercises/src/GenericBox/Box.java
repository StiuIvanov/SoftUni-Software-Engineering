package GenericBox;

public class Box<T> {
    public T item;

    public Box(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", item.getClass().getName(), item);
    }
}

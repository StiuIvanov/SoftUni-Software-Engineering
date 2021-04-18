package ListUtils;

import java.util.List;

public class ListUtils<T> {


    public static <T extends Comparable<T>> T getMax(List<T> list){
        validateSize(list.size());

        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max.compareTo(list.get(i))<0){
                max= list.get(i);
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T getMin(List<T> list){
        validateSize(list.size());

        T min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i))>0){
                min = list.get(i);
            }
        }

        return min;
    }

    private static void validateSize(int size) {
        if (size == 0) {
            throw new IllegalArgumentException();
        }
    }

}

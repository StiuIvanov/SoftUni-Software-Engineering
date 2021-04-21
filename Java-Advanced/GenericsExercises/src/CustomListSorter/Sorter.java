package CustomListSorter;

public class Sorter<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void sort(CustomList<T> list){
        for (int i = 0; i < list.size()-1; i++) {
            T element = list.get(i);
            for (int j = i+1; j < list.size(); j++) {
                T secondElement =  list.get(j);
                if (element.compareTo(secondElement)>0){
                    list.swap(i,j);
                }
            }
        }
    }


}

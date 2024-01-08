import java.util.List;

public class Week11 {
    /**
     * Generic sort.
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).compareTo(arr.get(j)) > 0) {
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    /**
     * Swap.
     */
    public static <T> void swap(List<T> arr, int i, int j) {
        T tmp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, tmp);
    }
}

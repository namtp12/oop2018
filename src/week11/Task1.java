package week11;

public class Task1 {
    public static <T extends Comparable> void sort(T[] list) {
        int n = list.length;
        T tmp;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                if(list[j].compareTo(list[j + 1]) > 0) {
                    tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
    }
}

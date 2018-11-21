package week11;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    // TODO: Find the max element in an array
    boolean isDouble = false;
    boolean isInt = false;
    boolean isString = false;
    public static <T extends Comparable> T findMax (List<T> list) {
        //T max = null;
        T max;
        if (list.isEmpty() || list == null) {
            return null;
        } else {
            max = list.get(0);
        }
        for(T t : list) {
            if(max.compareTo(t) < 0) {
                max = t;
            }
        }
        return max;
    }
    
    public static <T extends Comparable> T findMax (T[] list) {
        //T max = null;
        T max;
        if (list.length == 0 || list == null) {
            return null;
        } else {
            max = list[0];
        }
        for(T t : list) {
            if(max.compareTo(t) < 0) {
                max = t;
            }
        }
        return max;
    }
    
    // This is only used with others user-defined abstract data types for T
    // Since primitive data types have been supported comparable interface
    private <T> boolean isBiggerThan (T other) {
        return false;
    }
}

package week11;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    // TODO: Find the max element in an array
    boolean isDouble = false;
    boolean isInt = false;
    boolean isString = false;
    public static <T> T findMax (List<T> list) {
        T max = list.get(0);
        if (!list.isEmpty()) {
            max = list.get(0);
        }
        for(T t : list) {
            // if(t.getClass().getName().equals("Double")) { is not working
            if(t instanceof Double) {
                max = t;
            }
        }
        return max;
    }
    
    private <T> boolean isBiggerThan (T other) {
        return false;
    }
}
